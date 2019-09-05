import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/5
 * Time:13:49
 * Introduction:生成格雷码
 */
public class y2016_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        getGrem(n);
    }
    private static String[] getGrem(int n){
        List<String> strList = new ArrayList<>();
        if(n==1){
            String[] rsArr = new String[2];
            rsArr[0]="0";
            rsArr[1]="1";
            return rsArr;
        }else if(n<=0){
            return null;
        }
        else{
            strList.add("0");
            strList.add("1");
            for(int i=2;i<=n;i++){
                List<String> temp1 = new ArrayList<>();
                List<String> temp2 = new ArrayList<>();
               for(int j=0; j<strList.size();j++){
                   temp1.add("0"+strList.get(j));
                   temp2.add("1"+strList.get(j));
               }
               strList.clear();
               for(int j=0; j<temp1.size();j++){
                   strList.add(temp1.get(j));
               }
               for(int j=temp2.size()-1; j>=0; j--){
                   strList.add(temp2.get(j));
               }
            }
        }
        int len = strList.size();
        String[] rsArr = new String[len];
        for(int i=0;i<len; i++){
            rsArr[i] = strList.get(i);
            System.out.print(rsArr[i]+" ");
        }

        return rsArr;
    }
}
