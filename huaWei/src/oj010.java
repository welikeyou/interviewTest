import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/7
 * Time:20:27
 * Introduction:统计字符，使用Character
 */
public class oj010 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(countChar(str));
    }
    private static int countChar(String str){
        Set<Character> cSet = new HashSet<>();
        int len = str.length();
        for(int i=0; i<len; i++){
            char nowChar = str.charAt(i);
            if(nowChar>=0&&nowChar<=127){
                if(!cSet.contains(nowChar)){
                    cSet.add(nowChar);
                }
            }
        }
        return cSet.size();
    }
}
