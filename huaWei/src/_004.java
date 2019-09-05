import java.util.Scanner;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/3/19
 * Time:11:01
 * Introduction:最高成绩
 */
public class _004 {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            while(input.hasNext()){
                int N = input.nextInt();
                int M = input.nextInt();
                int[] grade = new int[N+1];
                for(int i=1; i<N+1; i++){
                    grade[i]=input.nextInt();
                }
                for(int i=0; i<M; i++){
                    String cation = input.next();
                    int A = input.nextInt();
                    int B = input.nextInt();
                    if(cation.equals("Q")){

                        int down = Math.min(A,B);
                        int top = Math.max(A,B);
                        int max = grade[down];
                        if(top>=N+1){
                            break;
                        }
                        for(int j=down; j<=top; j++){
                            if(max<grade[j]){
                                max=grade[j];
                            }
                        }
                        System.out.println(max);
                    }else if(cation.equals("U")){
                        if(A>=N+1){
                            break;
                        }
                        grade[A]=B;
                    }
                }
            }

        }
    }

