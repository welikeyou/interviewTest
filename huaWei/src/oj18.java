import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/7
 * Time:21:26
 * Introduction:网络类型分类
 * 1、数字字符串转换成二进制的方式：BigInteger
 * 2、掩码的基本知识
 * 3、正则匹配： .属于特殊字符，匹配时要转义\\. ;\\d只能拼配单个数字
 */
public class oj18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int count =0;
        int[] typeNum = new int[7];//存储七种类型0~4 ABCDE 5：错误 6：私网
        while(input.hasNextLine()){

            String str = input.nextLine();
            if(str.equals("")){
                break;
            }
            count ++;
            if(str.matches("([0-9]{1,3}\\.){3}[0-9]{1,3}~([0-9]{1,3}\\.){3}[0-9]{1,3}")){
                String[] net = str.split("~");
                String[] net1 = net[0].split("\\.");
                String[] mask = net[1].split("\\.");
                if(between255(net1)&&isLegalMask(mask)){
                    int type = Integer.parseInt(net1[0]);
                       if(type>=0&&type<=126){
                        typeNum[0] +=1;
                        if(type==10){
                            typeNum[6] +=1;
                        }
                    }else if(type>=128&&type<=191){
                        typeNum[1] +=1;
                           if(type==172){
                               int type2 = Integer.parseInt( net1[1]);
                               if(type2>=16&&type2<=32){
                                   typeNum[6] +=1;
                               }
                           }
                    }else if(type<=223){
                        typeNum[2]+=1;
                        if(type==192){
                            int type2 = Integer.parseInt( net1[1]);
                            if(type2==168){
                                typeNum[6] +=1;
                            }
                        }
                    }else if(type<=239){
                        typeNum[3]+=1;
                    }else  if(type<=240){
                        typeNum[4]+=1;
                    }
                }
            }
        }
        typeNum[5] = count-typeNum[0]-typeNum[1]-typeNum[2]-typeNum[3]-typeNum[4];
        for(int i=0; i<7; i++){
            System.out.print(typeNum[i]+" ");
        }
    }
    private static boolean between255(String[] net){
        for(int i=0; i<net.length; i++){
            if(!(Integer.parseInt(net[i])>=0&&Integer.parseInt(net[i])<=256)){
                return false;
            }
        }
        return true;
    }
    private static boolean isLegalMask(String[] mask){
        StringBuilder second = new StringBuilder();
      for(int i=0; i<mask.length; i++){
          //将其转换成二进制
 /*         int intmask = Integer.parseInt(mask[i]);
          String subSecond="";
          while(intmask!=0){
              subSecond = intmask%2+subSecond;
              intmask = intmask/2;
          }
          if(intmask==0){
              int len = subSecond.length();
              for(int j=len; j<8; j++){
                  subSecond = "0"+subSecond;
              }
          }
          second +=subSecond;*/
          //转换二进制的改进方法
          BigInteger integer = new BigInteger(mask[i]);
          second.append(integer.toString(2));
      }
      if(second.toString().matches("1*0*")){
          return true;
      }
      return false;
    }
}
