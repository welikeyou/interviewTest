import java.util.Scanner;
import static java.lang.Math.*;

//import static java.lang.Math.max;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/4
 * Time:19:03
 * Introduction:动态规划之寻找最大和的子数组
 */
public class dArrange {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();//数组长度
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(longest(arr));
    }
    private static int longest(int[] array){
        int maxSum = array[0];
        int maxTemp = array[0];
        int len = array.length;
        for(int i=1; i<len; i++){
            maxTemp = max(array[i],maxTemp+array[i]);
            maxSum = max(maxSum,maxTemp);
        }
        return maxSum;
    }
}
