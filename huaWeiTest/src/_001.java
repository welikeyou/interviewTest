import java.util.Scanner;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/10
 * Time:17:46
 * Introduction:
 */
public class _001 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            String pswd = input.next();
            String psre = new StringBuilder(pswd).reverse().toString();
            int len = pswd.length();
            int max = 0;
            for(int i=2; i<len; i++){
               /* for(int j=i+1; j<len; j++){
                    String subPs = psre.substring(i,j);
                    if(pswd.contains(subPs)){
                        int count = j - i +1;
                        if(count>max){
                            max=count;
                        }
                    }
                }*/
               int count = 0;
               int beIndex=0;
               if(pswd.charAt(i)==pswd.charAt(i-2)){
                   count +=3;
                   beIndex = i-1;
                   i++;
                   while(i<len&&(2*beIndex-i)>=0&&pswd.charAt(i)==pswd.charAt(2*beIndex-i)){
                       i++;
                       count +=2;
                   }
               }else if(pswd.charAt(i)==pswd.charAt(i-1)){
                   count +=2;
                   beIndex = i-1;
                   while(i<len&&(2*beIndex-i+1)>=0&&pswd.charAt(i)==pswd.charAt(2*beIndex-i+1)){
                       i++;
                       count +=2;
                       if(i>=len||(2*beIndex-i+1)<=0){
                           break;
                       }
                   }
               }

               if(max<count){
                   max = count;
               }
            }
            System.out.println(max);
        }
    }
}
