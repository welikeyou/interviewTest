import java.util.Scanner;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/4
 * Time:16:23
 * Introduction:素数对
 * 1、巧妙之处在于利用数组的标号计算相加的结果
 * 2、求素数时只需要计算到sqrt（n）
 * 3、1既不是素数又不是合数
 */
public class fall2017_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int Num = input.nextInt();
        int[] Su = new int[1000];
        Su[1]=0;
        for(int i=2; i<1000; i++){
            if(isSu(i)){
                Su[i]=1;
            }else{
                Su[i]=0;
            }
        }
        int count = 0;
        for(int i=1;i<=Num/2;i++){
            if((Su[i]&Su[Num-i])!=0){
                count++;
            }
        }
       System.out.println(count);
    }
    private static boolean isSu(int num){
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
