import java.util.Scanner;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/14
 * Time:11:34
 * Introduction:
 */
public class _004 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int minDiff = 0;
        int total = 0;
        int num1=0;
        while(N-->0){
            int num2 = input.nextInt();
            int diff = num1-num2;
            total +=diff;
            if(minDiff>total){
                minDiff = total;
            }
            num1 = num2;
        }
        int start = -minDiff;
        System.out.println(start);
    }
}
