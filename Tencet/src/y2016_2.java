import java.util.*;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/5
 * Time:14:16
 * Introduction:红包金额
 */
public class y2016_2 {
    public static void main(String[] args){
              int n=5;
              int[] gifts = {1,2,3,2,5};
             System.out.println(getGif(gifts,n));
    }
    private static int getGif(int[] gifts, int n){
        Map<Integer,Integer> giftMap = new HashMap<>();
        for(int i=0; i<n; i++){
            if(giftMap.containsKey(gifts[i])){
                giftMap.put(gifts[i],giftMap.get(gifts[i])+1);
            }else{
                giftMap.put(gifts[i],1);
            }
        }
        int max = 0;
        int money=0;
        for(Integer key : giftMap.keySet()){
            if(giftMap.get(key)>max){
                max = giftMap.get(key);
                money = key;
            }
        }
        if(max>=(n+1)/2){
            return money;
        }
        else{
            return 0;
        }
    }
}
