import sun.awt.util.IdentityArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/5
 * Time:15:09
 * Introduction:大整数乘
 * 状态：通过
 * 1、两个数相乘不会最长不会超过两个数个数和
 * 2、字符转数字的简单方法
 */
public class _002 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str1 = new StringBuilder(input.next()).reverse().toString();
        String str2 = new StringBuilder(input.next()).reverse().toString();
        int len1 = str1.length();
        int len2 = str2.length();
        int[] rs = new int[len1+len2];
        for(int i=0; i<len1; i++){
            int up = 0;
            int num1 =str1.charAt(i)-'0';
            int j=0;
            for(;j<len2; j++){
                int temp1 =num1*(str2.charAt(j)-'0');
                int now = (temp1+up+rs[i+j])%10;
                 up = (temp1+up+rs[i+j])/10;
                 rs[i+j]=now;
            }
            if(up!=0){
                int temp = rs[i+j]+up;
                if(temp>=10){
                    rs[i+j]=temp%10;
                    rs[i+j+1] +=temp/10;
                }else{
                    rs[i+j]=temp;
                }

            }
        }
        int high = len1+len2;
        while(rs[high-1]==0){
            high--;
        }

        for(int i=high-1; i>=0; i--){
           System.out.print(rs[i]);
        }
    }
}
