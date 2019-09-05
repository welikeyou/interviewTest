import java.util.Date;
import java.util.Scanner;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/7
 * Time:17:01
 * Introduction:进制转换，在oj005的基础上的变型，16进制转2进制
 */
public class oj005c {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()){
            String sixTheen = input.nextLine();
            long beforeTime = System.currentTimeMillis();
            System.out.println(sixTheen2Two(sixTheen));
            long afterTime = System.currentTimeMillis();
            System.out.println((long)(afterTime-beforeTime));
        }
    }
    private static String sixTheen2Two(String sixTheen){
        int len = sixTheen.length();
        String twoStr = "";
        for(int i=2; i<len; i++){
            char nowChar = sixTheen.charAt(i);
            int nowNum=0;
            if(nowChar>='0'&&nowChar<='9'){
                nowNum = nowChar-'0';
            }else if(nowChar>='A'&&nowChar<='F'){
                nowNum = nowChar-'A'+10;
            }else if(nowChar>='a'&&nowChar<='f'){
                nowNum = nowChar-'a'+10;
            }
            twoStr+=nowNum/8+""+(nowNum%8)/4+""+(nowNum%4)/2+""+nowNum%2;
        }
        return twoStr;
    }
}
