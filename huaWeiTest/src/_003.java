import java.util.Scanner;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/10
 * Time:19:17
 * Introduction:
 */
public class _003 {
    static int i= 0;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String str = input.next();
            int len = str.length();
            String myStr = "";
            String tempNum = "";
            str.replace('{', '(');
            str.replace('[', '(');
            str.replace('}', ')');
            str.replace(']', ')');
            for (int j = 0; j < len; j++) {
                if (str.charAt(j) == '(') {

                    if (j == 0) {
                        str = "1" + str;
                    } else {
                        if (!isDig(str.charAt(j - 1))) {
                            str = str.substring(0, j) + "1" + str.substring(j);
                        }
                    }
                }
            }
                len = str.length();
                while (i < len && isCha(str.charAt(i))) {
                    myStr += str.charAt(i);
                    i++;
                }
                while (i < len && isDig(str.charAt(i))) {
                    tempNum += str.charAt(i);
                    i++;
                }
                if (!tempNum.equals("")) {
                    int nextNum = Integer.parseInt(tempNum);
                    myStr += parseStr(nextNum, str);
                }
                String myRever = "";
                if (!myStr.equals("")) {
                    myRever = new StringBuilder(myStr).reverse().toString();
                }
                System.out.println(myRever);

            }

        }
    private static String parseStr(int num, String str){
        int len = str.length();
        String rs="";
            while(i<len&&isCha(str.charAt(i))||str.charAt(i)==')') {
                if (str.charAt(i) == ')') {
                    String tempStr = rs;
                    for (int j = 0; j < num-1; j++) {
                        rs += tempStr;
                    }
                    return rs;
                } else {
                    rs += str.charAt(i);
                    i++;
                }
            }
        String tempNum = "";
            while(i<len&&isDig(str.charAt(i))){
                tempNum +=str.charAt(i);
                i++;
            }
        int nextNum = Integer.parseInt(tempNum);
        rs = rs+parseStr(nextNum,str);
        while(i<len&&isCha(str.charAt(i))||str.charAt(i)==')') {
            if(str.charAt(i)==')'){
                break;
            }
            rs +=str.charAt(i);
            i++;
        }

        String tempStr = rs;
        for(int j=0; j<num-1; j++){
            rs +=tempStr;
        }
        return rs;
    }
    private static boolean isCha(char ch){
        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
            return true;
        }
        return false;
    }
    private static boolean isDig(char ch){
        if(ch>='0'&&ch<='9'){
            return true;
        }
        return false;
    }
}
