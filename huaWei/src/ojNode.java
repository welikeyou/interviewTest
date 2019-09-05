import java.util.Scanner;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/10
 * Time:11:38
 * Introduction:
 */
public class ojNode {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            int len = input.nextInt();
            int[] nodes = new int[len];
            for(int i=0; i<len; i++){
                nodes[i] = input.nextInt();
            }
            int k = input.nextInt();
            if(k>len|k<=0){
                System.out.println("");
            }else{
                System.out.println(nodes[len-k]);
            }
        }

    }
}
