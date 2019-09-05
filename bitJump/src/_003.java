import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/14
 * Time:11:16
 * Introduction:
 */
public class _003 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        while(N-->0){
            int M = input.nextInt();
            Map<String,Integer> myMap = new HashMap<>();
            int maxCount = 0;
            while(M-->0){
                int num = input.nextInt();
                String[] positions = new String[num];
                for(int i=0; i<num; i++){
                    positions[i] = input.next()+input.next();
                }
                while(num-->0){
                    String position = input.next()+input.next();
                    if(myMap.containsKey(position)){

                    }
                }
            }
        }
    }
}
