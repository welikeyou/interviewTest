import java.util.Scanner;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/7
 * Time:17:36
 * Introduction:
 */
public class oj007 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float f = input.nextFloat();
        int intf = (int)(((f*10)+5)/10);
        input.close();
        System.out.print(intf);
        }
    }
