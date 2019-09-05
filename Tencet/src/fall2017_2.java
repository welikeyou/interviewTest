import java.util.Map;
import java.util.Scanner;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/4
 * Time:15:53
 * Introduction:游戏状态
 * 1、直接用二进制位的0、1表示输赢两种状态
 * 2、java中没有无符号整形，用long类型
 * 3、对位操作可以使用|和&运算符，使用pow方法
 */
public class fall2017_2 {
    static long[] status = new long[32];
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int chageId = input.nextInt()-1;
        int queryId = input.nextInt()-1;
        if(chageId<0||chageId>1023||queryId<0||queryId>1023){
            System.out.println(-1);
        }else{
            change(chageId);
             System.out.println(query(queryId));
        }


    }
    private static void change(int changeId){
        int index = changeId/32;
        int seq = changeId%32;
        status[index]+=Math.pow(2,seq);
    }
    private static int query(int queryId){
        int index = queryId/32;
        int seq = queryId%32;
        if((status[index]|(long)Math.pow(2,seq))== (long)Math.pow(2,seq)){
            return 1;
        }
        return 0;

    }
}
