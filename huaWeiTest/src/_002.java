import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/10
 * Time:18:59
 * Introduction:
 */
public class _002 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        List<String> strList = new ArrayList<>();
        while(N-->0){
            String str = input.next();
            int len = str.length();
            int num = len/8;
            int left = len%8;
            for(int i=0; i<num; i++){
                strList.add(str.substring(8*i,8*(i+1)));
            }
            if(left>0){
                String leftStr = str.substring(8*num);
                for(int i=0; i<8-left; i++){
                    leftStr +="0";
                }
                strList.add(leftStr);
            }
        }
        Collections.sort(strList);
        for(String str: strList){
            System.out.print(str+" ");
        }
    }
}
