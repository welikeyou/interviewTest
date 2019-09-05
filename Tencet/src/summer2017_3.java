import java.util.*;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/4
 * Time:20:54
 * Introduction:
 */
public class summer2017_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            int N = input.nextInt();
            int[] numArr = new int[N];
            for(int i=0; i<N; i++){
                numArr[i]=input.nextInt();
            }
            Arrays.sort(numArr);
            int minCount = 0;
            int maxCount = 0;
            int min=numArr[N-1];
            int minN = 1;
            int maxN = 0;
            if(numArr[0]==numArr[N-1]){
                minCount = (N*(N-1))/2;
                maxCount = minCount;
                System.out.println(minCount+" "+maxCount);
                continue;
            }
            Map<Integer,Integer> diffNum = new HashMap<>();
            for(int i=0; i<N; i++){
                if(diffNum.containsKey(numArr[i])){
                    diffNum.put(numArr[i],diffNum.get(numArr[i])+1);
                }else{
                    diffNum.put(numArr[i],1);
                }
            }
            if(diffNum.size()==N){
                for(int i=0; i<N-1; i++){
                    int diff = numArr[i+1]-numArr[i];
                    if(diff<min){
                        min=diff;
                        minCount = 1;
                    }else if(diff==min){
                        minCount ++;
                    }
                }
            }else{
                for(Integer key : diffNum.keySet()){
                    int val = diffNum.get(key);
                    if(val>1){
                        minCount+=(val*(val-1))/2;
                    }
                }
            }
            minN = diffNum.get(numArr[0]);
            maxN = diffNum.get(numArr[N-1]);
             maxCount = minN*maxN;
            System.out.println(minCount+" "+maxCount);
            }
        }
    }
