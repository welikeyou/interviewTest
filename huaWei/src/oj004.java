import java.util.Scanner;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/7
 * Time:16:30
 * Introduction:字符串分割
 */
public class oj004 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        cutString(str1);
        cutString(str2);

    }
    private static void cutString(String str){
        int len = str.length();
        int count = len/8;
        for(int i=0; i<count; i++){
            System.out.println(str.substring(i*8,(i+1)*8));
        }
        int left = len%8;
        if(left!=0){
            System.out.print(str.substring(count*8));
            for(int i=0; i<8-left; i++){
                System.out.print(0);
            }
            System.out.println();
        }
    }
}
