import java.util.*;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/6
 * Time:13:55
 * Introduction:字符集合
 */
public class _2016_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()){
            String str = input.nextLine();
            Map<Character,Integer> charMap = new HashMap<>();
            List<Character> charList = new ArrayList<>();
            int len = str.length();
            for(int i=0; i<len; i++){
                char item = str.charAt(i);
                if(!charMap.containsKey(item)){
                    charMap.put(item,1);
                    charList.add(item);
                }
            }
            for(int i=0; i<charList.size(); i++){
                System.out.print(charList.get(i));
            }
            System.out.println("");
        }
    }
}
