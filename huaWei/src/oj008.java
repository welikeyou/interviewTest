import java.util.*;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/7
 * Time:17:46
 * Introduction:合并记录表
 */
public class oj008 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Map<Integer,Integer> table = new TreeMap<>();
        while(n-->0){
            int key = input.nextInt();
            int value = input.nextInt();
            if(table.containsKey(key)){
                value += table.get(key);
            }
            table.put(key, value);
        }
        //遍历map的几种方式
        for(Integer item : table.keySet()){
            System.out.println(item+" "+table.get(item));
        }
        Iterator<Map.Entry<Integer,Integer>> it = table.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer,Integer> item = it.next();
            System.out.println(item.getKey()+" "+item.getValue());
        }
        //推荐，尤其是数据量大的时候
        for(Map.Entry<?,?> entry : table.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
