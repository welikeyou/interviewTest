import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new  Scanner(System.in);
        int l = input.nextInt();
        int r = input.nextInt();
        int count =0;
        String start = "";
        for(int i=1; i<=l; i++){
            start += i;
        }
        for(int i =l+1; i<=r; i++){
            int istart = Integer.parseInt(start);
            if(istart%3==0){
                count++;
            }
            start += i;
        }
        System.out.println(count);

    }
}