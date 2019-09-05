import java.util.*;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/5
 * Time:14:38
 * Introduction:拼多多最大乘积
 * 注意数据范围 long类型可保存的数据范围是9的20次方，即可以有19位
 * int类型的数据范围一共可以有10位，最高位为2
 */
public class _001 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> intArr = new ArrayList<>();
        while(n-->0){
            intArr.add(input.nextInt());
        }
        Collections.sort(intArr);
        if(intArr.size()<3){
            System.out.print(0);
        }else{
            int len = intArr.size();
            long max1 =(long) intArr.get(len-1)*intArr.get(len-2)*intArr.get(len-3);
            long max2 = (long)intArr.get(len-1)*intArr.get(0)*intArr.get(1);
            long max = Math.max(max1,max2);
            System.out.println(max);
            for(int i=len-1; i>=len-3; i--){
                System.out.println(intArr.get(i));
            }
        }
    }
}
