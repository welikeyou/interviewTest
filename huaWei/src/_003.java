import java.util.Scanner;

import static java.lang.Math.pow;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/3/19
 * Time:9:11
 * Introduction:
 */
public class _003 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.next().trim();
        String str1=str.toLowerCase();
        int num =0;
        int len = str1.length();
        for(int i=2; i<len; i++){
            if(str1.charAt(i)>='0'&&str1.charAt(i)<='9'){
                num+=(str1.charAt(i)-48)*pow(16,len-1-i);
            }else{
                num+=(str1.charAt(i)-87)*pow(16,len-1-i);
            }

        }
        System.out.println(num);
    }
}
