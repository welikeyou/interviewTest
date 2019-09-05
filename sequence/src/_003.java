import java.util.*;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/5
 * Time:16:35
 * Introduction:
 */
public class _003 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> h = new ArrayList<>();
        for(int i=0; i<n; i++){
            h.add(input.nextInt());
        }
        int m = input.nextInt();
        List<Integer> w = new ArrayList<>();
        for(int i=0; i<m; i++){
            w.add(input.nextInt());
        }
        Collections.sort(h);
        Collections.sort(w);
        int count = 0;
        for(int i=0; i<w.size(); i++){
            for(int j=h.size()-1; j>=0; j--){
                if(w.get(i)>=h.get(j)){
                    count++;
                    h.remove(j);
                    break;
                }
            }
        }
        System.out.print(count);
    }
}
