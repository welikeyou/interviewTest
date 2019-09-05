import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/6
 * Time:13:29
 * Introduction:删数
 */
public class _2016_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()){
            int n =Integer.parseInt(input.nextLine());
            if(n>1000){
                n = 999;
            }else if(n<=0){
                System.out.println("");
            }else if(n==1){
                System.out.println(0);
            }else if(n==2){
                System.out.println(1);
            }else{
                List<Num> numList = new ArrayList<>();
                for(int i=0; i<n; i++){
                    Num item = new Num(i,i);
                    numList.add(item);
                }

                int index = 2;
                while(numList.size()!=1){
                    if(index>=numList.size()){
                        index = index%numList.size();
                    }
                    numList.remove(index);
                    index+=2;
                }
                System.out.println(numList.get(0).index);
            }
        }

    }
}
class Num{
    int num = 0;
    int index = 0;
    public Num(int num, int index){
        this.num= num;
        this.index = index;
    }
}
