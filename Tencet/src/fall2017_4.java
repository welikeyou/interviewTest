import java.util.Scanner;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/5
 * Time:11:00
 * Introduction:
 */
public class fall2017_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] range = new int[181];
        int value = -90;
        for(int i=0; i<=180; i++){
            range[i]=value;
            value++;
        }
        int low = 0;
        int up = 180;
        int mid = (low+up)/2;
        boolean flag = false;
        if(n<0){
            flag = true;
        }
        while(up-low>=5){
            if(n>=range[mid]){
                low=mid;
                mid = (low+up)/2;
                if(flag){
                    mid =(low+up+1)/2;
                }
                System.out.print(1);
            }else if(n<range[mid]){
                up = mid;
                mid = (low+up)/2;
                if(flag){
                    mid =(low+up+1)/2;
                }
                System.out.print(0);
            }
        }
    }
}
