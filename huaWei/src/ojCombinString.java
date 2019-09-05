import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/9
 * Time:15:40
 * Introduction:字符串合并
 * 1、Integer.toBinaryString(ich)：可以将int型的数据直接转换成二进制
 * 2、将字符型的str十进制转换成二进制：BigInteger istr = new BigInteger(str); String bit = istr.toString(2)
 *3、BigInteger istr = new BigInteger(str); String bit = istr.toString(16) 是小写字母，更简便的方法是自己返回
 * */
public class ojCombinString {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            String str1 = input.next();
            String str2 = input.next();
//        if(str1.matches("([0-9]*|[A-F]*|[a-f]*)*")&&str2.matches("([0-9]*|[A-F]*|[a-f]*)*")){
            StringBuilder strb = new StringBuilder();
            strb.append(str1);
            strb.append(str2);
            List<Character> oddList = new ArrayList<>();
            List<Character> evenList = new ArrayList<>();
            int len = strb.length();
            for(int i=0; i<len; i++){
                if(i%2==0){
                    evenList.add(strb.charAt(i));
                }else{
                    oddList.add(strb.charAt(i));
                }
            }
            Collections.sort(evenList);
            Collections.sort(oddList);
            for(int i=0; i<len/2; i++){
                if(isBetween(evenList.get(i))){
                    System.out.print(toRever(evenList.get(i)));
                }else
                {
                    System.out.print(evenList.get(i));
                }
                if(isBetween(oddList.get(i))){
                    System.out.print(toRever(oddList.get(i)));
                }else{
                    System.out.print(oddList.get(i));
                }

            }
            if(len%2!=0) {
                if(isBetween(evenList.get(oddList.size()-1)))
                {
                    System.out.print(toRever(evenList.get(evenList.size()-1)));
                }else{
                    System.out.print(evenList.get(evenList.size()-1));
                }
            }
            System.out.println();

        }

    }
    //    }
    private static boolean isBetween(char ch){
        if((ch>='0'&&ch<='9')|(ch>='a'&&ch<='f')|(ch>='A'&&ch<='F')){
            return true;
        }
        return false;
    }
    private static String toRever(char ch){
        int ich = 0;
        if(ch>='0'&&ch<='9'){
            ich = ch - '0';
        }else if(ch>='A'&&ch<='F'){
            ich = ch - 'A'+10;
        }else{
            ich = ch - 'a'+10;
        }
        StringBuilder bit2r = new StringBuilder(Integer.toBinaryString(ich)).reverse();
        int count = 0;
        for(int i=0; i<bit2r.length(); i++){
            count += (bit2r.charAt(i)-'0')*Math.pow(2,3-i);
        }
        String counts = count+"";
        BigInteger countsb = new BigInteger(counts);
        return countsb.toString(16).toUpperCase();
    }

}
