import java.util.*;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/9
 * Time:20:01
 * Introduction:四则运算
 * 定义优先级：左括号的优先级低于运算符，方便运算符进栈。由于已经保证了表达式的合法性，所以可以把{和[替换成（
 * 左括号的处理方式是直接进栈
 * 右括号的处理方式是一直出栈直到遇到左括号
 * 运算符的处理方式是比较优先级，小于等于栈顶优先级就一直出栈
 * 判断-号是负数前缀还是减号，通过判断-前面一个字符
 * 在循环读取数字时注意数组是否越界，读取后要注意回到前一个
 */
public class ojCalculate {
   static List<Character> op = new ArrayList<>();
   static List<Integer> opNum = new ArrayList<>();
   static String exp = "";
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Map<Character,Integer> grand = new HashMap<>();
        grand.put('#',0);
        grand.put('+',4);
        grand.put('-',4);
        grand.put('*',5);
        grand.put('/',5);
        grand.put('{',1);
        grand.put('[',2);
        grand.put('(',3);
        while(input.hasNext()){
            exp = input.next();
            List<Character> kuo = new ArrayList<>();
            int len = exp.length();
                op.add('#');
                for(int i=0; i<len; i++){

                    boolean isN = false; // 负号
                    if (i == 0 && exp.charAt(i) == '-') {
                        isN = true;
                        ++i;
                    } else if (exp.charAt(i) == '-' && (exp.charAt(i - 1) == '-' || exp.charAt(i - 1) == '+'
                            || exp.charAt(i - 1) == '*' || exp.charAt(i - 1) == '/' || exp.charAt(i - 1) == '('
                            || exp.charAt(i - 1) == '[' || exp.charAt(i - 1) == '{')) {
                        isN = true;
                        ++i;
                    }
                    char ch = exp.charAt(i);
                    if(ch>='0'&&ch<='9'){
                        int num = 0;
                        while(ch>='0'&&ch<='9'){
                            num = num*10 + ch-'0';
                            i++;
                            if(i<len){
                                ch = exp.charAt(i);
                            }else {
                                break;
                            }
                        }
                        i--;
                        if(isN){
                            opNum.add(0-num);
                            isN=false;
                        }else{
                            opNum.add(num);
                        }

                    }else {
                        if(ch==')'){
                            while(op.get(op.size()-1)!='('){
                                opreation();
                            }
                            op.remove(op.size()-1);
                        }else if(ch=='}'){
                            while(op.get(op.size()-1)!='{'){
                                opreation();
                            }
                            op.remove(op.size()-1);
                        }else if(ch==']'){
                            while(op.get(op.size()-1)!='['){
                                opreation();
                            }
                            op.remove(op.size()-1);
                        }else if(ch=='('|ch=='{'|ch=='['){
                            op.add(ch);
                        }
                        else{
                            int pri = grand.get(ch);
                            int priB = grand.get(op.get(op.size()-1));
                            while(pri<=priB&&priB!=1&&priB!=2&&priB!=3){
                                opreation();
                                priB = grand.get(op.get(op.size()-1));
                            }
                                op.add(ch);
                        }
                    }
                }
                while(opNum.size()!=1){
                    opreation();
                }
                System.out.println(opNum.get(0));
                opNum.clear();
                op.clear();
            }

        }
    private static void opreation(){//当前字符
            int op1 = opNum.get(opNum.size()-1);
            opNum.remove(opNum.size()-1);
            int op2 = opNum.get(opNum.size()-1);
            opNum.remove(opNum.size()-1);
            switch(op.get(op.size()-1)){
                case '+': opNum.add(op1+op2); break;
                case '-': opNum.add(op2-op1);break;
                case '*': opNum.add(op1*op2);break;
                case '/': opNum.add(op2/op1);break;
            }
            op.remove(op.size()-1);
    }


}
