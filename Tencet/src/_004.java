import java.util.Scanner;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/3
 * Time:21:19
 * Introduction:
 */
public class _004 {
    public  static  void  main(String[] args){
        Scanner input = new Scanner(System.in);
        int K = input.nextInt();
        int A = input.nextInt();
        int X = input.nextInt();
        int B = input.nextInt();
        int Y = input.nextInt();
        int[][] cX = new int[X+1][X+1];
        int[][] cY = new int[Y+1][Y+1];
        cX[0][0] = 1;
        cY[0][0] = 1;
        for(int i=1; i<=X; i++){
            cX[i][0] = 1;
            for(int j=1; j<=i; j++){
                cX[i][j] = cX[i-1][j]+cX[i-1][j-1];
            }
        }
        for(int i=1; i<=Y; i++){
            cY[i][0] = 1;
            for(int j=1; j<=i; j++){
                cY[i][j] = cY[i-1][j]+cY[i-1][j-1];
            }
        }
        System.out.println(cX[3][1]+" "+cY[3][1]);
        int maxYue = maxYue(A,B);
        int mutA = B/maxYue;
        int mutB = A/maxYue;
        int maxA = K/A;
        int minB = 0;
        while((K-A*maxA)%B!=0){
            maxA--;
            minB = (K-A*maxA)/B;
        }
        while(maxA>X){
            maxA-=mutB;
            minB+=mutA;
        }
        if(minB>Y){
            System.out.println(0);
        }else{
            long total=0;
            for(int i=maxA; i>=0; i-=mutB){
                total  += cX[X][maxA]*cY[Y][minB];
                maxA-=mutB;
                minB+=mutA;
            }
            System.out.println(total);
        }

    }
    public static int maxYue(int a, int b){
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        int rs=0;
        while(min!=0){
            int temp = min;
            rs=max/min;
            min = max%min;
            max = temp;
            if(min==1){
                rs=1;
                break;
            }
        }
        return rs;
    }
 /*   public static  int chooseNum(int c, int base){
        if(c>base/2){
            c=base-c;
        }
        int up = 1;
        int down = 1;
        int j=1;
        for(int i=base; i>base-c; i--){
            up *=i;
            down *=j;
            j++;
        }
        return up/down;
    }*/
}
