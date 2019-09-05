import java.util.Scanner;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/7
 * Time:21:02
 * Introduction:坐标移动；使用正则表达式
 */
public class oj016 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(getPositon(str));

    }
    private static String getPositon(String str){
        int[] positon = new int[2];
        positon[0]=0;
        positon[1]=0;
        String[] op = str.split(";");
        int len = op.length;
        for(int i=0; i<len; i++){
            if(op[i].matches("(A|D|W|S)[0-9]{1,2}")){
                int step = Integer.parseInt(op[i].substring(1));
                switch (op[i].charAt(0)){
                    case 'A': positon[0] -=step; break;
                    case 'D': positon[0] +=step; break;
                    case 'W': positon[1] +=step; break;
                    case 'S': positon[1] -=step; break;

                }
            }
        }
        return positon[0]+" "+positon[1];
    }
}
