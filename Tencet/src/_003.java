/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/3
 * Time:20:40
 * Introduction:
 */
import java.util.*;
public class _003{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int high = M;
        int low = 1;
        int mid = (high+low+1)/2;

        while(high>=low){
            int acM = enough(mid,N);
            if(acM==M){
                break;
            }
            else if(acM>M){
                high = mid-1;
                mid = (high+low+1)/2;
            }else{
                low = mid+1;
                mid = (high+low+1)/2;
            }
        }

        System.out.println(high);
    }
    public static int enough(int first,int dayNum){
        int total=0;
        for(int i=0; i<dayNum; i++){
            total +=first;
            first = (first+1)/2;
        }
        return total;
    }
}
