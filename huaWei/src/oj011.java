import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/7
 * Time:20:42
 * Introduction:
 * List的Collections.sort方法对字符串是按照字典序来排序的
 * String 数组的Arrays.sort方法也是按字典序排序的
 */
public class oj011 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
//        Scanner scanner = new Scanner(Main.class.getClassLoader().getResourceAsStream("data.txt"));

        while (scanner.hasNext()) {
            int num = Integer.parseInt(scanner.nextLine());
 /*           List<String> list = new ArrayList<>(num);

            while ((--num) >= 0) {
                list.add(scanner.nextLine());
            }

            Collections.sort(list);

            for (String s : list) {
                System.out.println(s);
            }*/
           String[] strArr = new String[num];
           for(int i=0; i<num; i++){
               strArr[i]=scanner.nextLine();
           }
            Arrays.sort(strArr);
           for(String str :strArr){
               System.out.println(str);
           }
        }

        scanner.close();
    }
}

