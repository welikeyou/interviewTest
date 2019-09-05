import java.util.Scanner;
public class _001 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String statement = input.nextLine();
        int len = statement.length();
        String temp = "";
        for(int i=len-1; i>=0; i--){
            switch(statement.charAt(i)){
                case '.':
                case '\"':
                case ' ':
                case ',':
                case'-':
                case '\'':

                    System.out.print(temp+statement.charAt(i));  temp = "";break;
                default: temp=statement.charAt(i)+temp;
            }
        }
        System.out.print(temp);
    }
}
