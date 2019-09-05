import java.util.Scanner;

import static java.lang.Math.*;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/2
 * Time:19:54
 * Introduction:
 */
public class _002 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
      int N = input.nextInt();
    /*    while(input.hasNext()){
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println(isSu(a,b));
        }*/
      int[] numArr = new int[N];
        for(int i=0; i<N; i++){
            numArr[i] = input.nextInt();
        }
        int count = 0;
        for(int i=0;i<N; i++){
            for(int j=i+1; j<N; j++){
                if(isSu(numArr[i],numArr[j])){
                  count += N-j-1;
                }else {
                    for (int k = j + 1; k < N; k++) {
                        if (isSu(numArr[i], numArr[k]) || isSu(numArr[j], numArr[k])) {
                            count++;
                        }
                    }
                }
            }
        }
        System.out.print(count);
    }
    public static boolean isSu(int a, int b){
        int max = max(a,b);
        int min = min(a,b);
        boolean rs = true;
        while(min!=1){
            int temp = min;
            min = max%min;
            max = temp;
            if(min==1){
                break;
            }
            if(min==0){
                rs=false;
                break;
            }
        }
         return rs;
    }
}

