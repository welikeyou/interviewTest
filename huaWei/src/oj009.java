import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/7
 * Time:20:17
 * Introduction:提取不重复的数字，使用set类型
 */
public class oj009 {
    public static void  main(String[] args){
        Scanner input = new Scanner(System.in);
        int iNum = input.nextInt();
        Set<Integer> iSet = new HashSet<>();
        if(iNum==0){
            System.out.print(0);
        }else{
            while(iNum>0){
                int each = iNum%10;
                if(!iSet.contains(each)){
                    System.out.print(each);
                    iSet.add(each);
                }
                iNum = iNum/10;
            }
        }
    }
}
