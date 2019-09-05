import java.util.*;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/2
 * Time:21:02
 * Introduction:
 */
public class _003 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int W = input.nextInt();
        List<Integer> weight = new ArrayList<>();
        List<Integer> sortW = new ArrayList<>();
        boolean[] flag = new boolean[N];
        for(int i=0;i<N; i++){
            weight.set(i,input.nextInt()) ;
        }
        Collections.sort(weight);
        int count = 0;
        for(int i=0; i<weight.size();i++){
            if(flag[i]){
                break;
            }
            for(int j=i+1; j<weight.size();j++){
                if(weight.get(i)+weight.get(j)>W){
                    count +=2;
                    weight.remove(i);
                    weight.remove(j);
                    flag[j]=true;
                }
            }
        }
        for(int i=0; i<weight.size();){
            int total=0;
            while(total<W){
                total+=weight.get(i);
                i++;
            }
            count++;
        }
        System.out.print(count);

    }


}
