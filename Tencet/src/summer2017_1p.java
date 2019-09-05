import java.util.Scanner;
/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/4
 * Time:19:19
 * Introduction:最大回文改进版，使用动态规划
 */
public class summer2017_1p {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            String str = input.next();
            int num = creatH(str,new StringBuilder(str).reverse().toString());
            System.out.println(num);
        }
    }
    private static int creatH(String str1, String str2){
        int len1 = str1.length();
        int len2 = str2.length();
        int[][] countArr = new int[len1+1][len2+1];
        //if(str1.charAt(0)==str2.charAt(0)) countArr[0][0]=1;
        for(int i=1; i<=len1; i++){
            for(int j=1; j<=len2; j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    countArr[i][j] = countArr[i-1][j-1]+1;
                }else{
                    countArr[i][j] = Math.max(countArr[i][j-1],countArr[i-1][j]);
                }
            }
        }
        return len1-countArr[len1][len2];
    }
}
