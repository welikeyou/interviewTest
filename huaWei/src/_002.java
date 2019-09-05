/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/3/19
 * Time:8:51
 * Introduction:
 */
import java.util.*;

public class _002{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Integer> romList = new ArrayList<>();
        Map<Integer, String> students = new HashMap<>();
        int n = input.nextInt();
        for(int i=0; i<n; i++){
            int romNum = input.nextInt();
            if(!students.containsKey(romNum)){
                students.put(romNum,null);
                romList.add(romNum);
            }

        }
          Collections.sort(romList);
        for(int i=0; i<romList.size(); i++){
            System.out.println(romList.get(i));
        }
    }
}
