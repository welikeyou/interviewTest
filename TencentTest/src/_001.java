import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/5
 * Time:20:20
 * Introduction:
 */
public class _001 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for(int k=0; k<T; k++){
            int N = input.nextInt();
            int[] arr = new int[N];
            for(int i=0; i<N; i++){
                arr[i] = input.nextInt();
            }
            int need = N;
            List<Integer> left = new ArrayList<>();
            for(int i=0; i<N; i++){
                if(arr[i]==need){
                    String out =need+ " ";
                    int query = need-1;
                    boolean flag = false;
                    Collections.sort(left);
                    int up = left.size()-1;
                    int low = 0;
                    int mid = (up+low+1)/2;

                    while(low<up){
                        if(left.get(mid)==query){
                            query = query-1;
                            out+=left.get(mid)+" ";
                            left.remove(mid);
                            flag=true;
                        }else if(left.get(mid)<query){
                            low=mid+1;
                            mid=(up+low+1)/2;
                        }else if(left.get(mid)>query){
                            up=mid-1;
                            mid=(up+low+1)/2;
                        }
                    }
                    if(flag){
                        for(int j=mid; j>=0; j--){
                            if(left.get(mid)==query){
                                out+=left.get(i)+" ";
                            }else{
                                break;
                            }
                        }
                    }
                    System.out.println(out);
                    need=query;
                }else{
                    left.add(arr[i]);

                    System.out.println("");
                }
            }
        }
    }
}
