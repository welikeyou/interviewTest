import java.util.*;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/12
 * Time:18:43
 * Introduction:
 */
public class _002 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int c = input.nextInt();
        input.nextLine();
        List<Integer> colors = new ArrayList<>();
        List<Set<Integer>> pear = new ArrayList<>();
        for(int i=0; i<n; i++){
            String colorType = input.nextLine();
            String[] colorArr = colorType.split("\\s");
            Set<Integer> colorSet = new HashSet<>();
            for(int j=0; j<colorArr.length; j++){
                colorSet.add(Integer.parseInt(colorArr[j]));
            }
            pear.add(colorSet);
        }
        for(int i=1; i<=c; i++){
            colors.add(i);
        }
        for(int i=0; i<colors.size(); i++){
            boolean isRepeat = false;
            for(int j=0; j<n+m; ){
                if(pear.get(j%n).contains(colors.get(i))){
                    int lastIndex = j + m;
                    j++;
                    while(j<lastIndex&&j<n+2){
                        if(pear.get(j%n).contains(colors.get(i))){
                            colors.remove(i);
                            i--;
                            isRepeat = true;
                            break;
                        }
                        j++;
                    }
                }else{
                    j++;
                }
                if(isRepeat) break;
            }
        }
        int num = c - colors.size();
        System.out.println(num);
    }
}
