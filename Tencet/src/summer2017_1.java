import java.util.Scanner;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/4
 * Time:16:52
 * Introduction:
 */
public class summer2017_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()){
            String str = input.nextLine();
            int len = str.length();
            int i=0;
            int j = len-1;
            int count = 0;
            while(i<=j){
                char ci = str.charAt(i);
                char cj = str.charAt(j);
                if(ci==cj){
                    i++;
                    j--;
                }else{
                    if(str.substring(i+1,j).indexOf(cj)==-1||j-str.substring(i+1,j).lastIndexOf(ci)>str.substring(i+1,j).indexOf(cj)-i){
                        count++;
                        j--;
                    }else{
                        count++;
                        i++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
