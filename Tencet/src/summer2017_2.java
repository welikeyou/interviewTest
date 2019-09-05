import java.util.Scanner;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/4
 * Time:20:33
 * Introduction:将大写字符移动到后面
 */
public class summer2017_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            String str = input.next();
            StringBuilder strB = new StringBuilder(str);
            int len = strB.length();
            for(int i=0; i<len; i++){
                if(strB.charAt(i)>='A'&&strB.charAt(i)<='Z'){
                    strB.append(strB.charAt(i));
                    strB.delete(i,i+1);
                    i--;
                    len--;
                }
            }
            System.out.println(strB);
        }

    }
}
