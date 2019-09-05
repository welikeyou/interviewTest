import java.util.Scanner;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/7
 * Time:16:47
 * Introduction:进制转换
 */
public class oj005 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()){
            String numSixtheen  = input.nextLine();
            System.out.println(sixTheen2ten(numSixtheen));
        }
    }
    private static int sixTheen2ten(String sixTheen){
        int len = sixTheen.length();
        int pos = len-3;
        int ten = 0;
        for(int i=2; i<len; i++){
            char nowChar = sixTheen.charAt(i);
            if(nowChar>='0'&&nowChar<='9'){
                ten +=Math.pow (16,pos)*(nowChar-'0');
            }else if(nowChar>='A'&&nowChar<='F'){
                ten +=Math.pow (16,pos)*(nowChar-'A'+10);
            }else if(nowChar>='a'&&nowChar<='f'){
                ten +=Math.pow (16,pos)*(nowChar-'a'+10);
            }
            pos--;
        }
        return ten;
    }
}
