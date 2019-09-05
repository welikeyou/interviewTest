import java.util.*;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/10
 * Time:23:08
 * Introduction:
 */
public class _001 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n =input.nextInt();
        Map<Integer, List<Integer>> love = new HashMap<>();
        for(int i=1; i<=n; i++){
            int userLove = input.nextInt();
            if(love.containsKey(userLove)){
                love.get(userLove).add(i);
            }else{
                List<Integer> userId = new ArrayList<>();
                userId.add(i);
                love.put(userLove,userId);
            }
        }
        int q = input.nextInt();
        while(q-->0){
            int l =input.nextInt();
            int r = input.nextInt();
            int k = input.nextInt();
            int count = 0;
            List<Integer> targetList = love.get(k);
            int left = 0;
            int right = targetList.size()-1;
            while(left<right){
                int mid = (left+right+1)/2;
                if(targetList.get(mid)<l){
                    left= mid+1;
                }else if(targetList.get(mid)>right){
                    right=mid-1;
                }else{
                    break;
                }
            }
            while(targetList.get(left)>l){
                left--;
                if(left<0){
                    left++;
                    break;
                }
            }
            while(targetList.get(right)<r){
                right++;
                if(right>=targetList.size()){
                    right--;
                    break;
                }
            }
            System.out.println(right-left+1);
        }
    }
}
