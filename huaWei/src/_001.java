import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/3/19
 * Time:8:40
 * Introduction:换汽水
 */
public class _001 {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            while(input.hasNextInt()){
                int n = input.nextInt();
                if(n==0){
                    break;
                }
                int can=0;
                int left = n;
                while(true){
                    int x = left/3;
                    can = can + x;
                    left = left%3+x;
                    if(left<=1){
                        break;
                    }
                    if(left==2){
                        can ++ ;
                        break;
                    }
                }
                System.out.println(can);
            }

        }
    }

