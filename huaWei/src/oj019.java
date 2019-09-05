import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/9
 * Time:9:19
 * Introduction:数据分类处理
 */
public class oj019 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()){
            int Ni = input.nextInt();
            String[] iArr = new String[Ni];
            int count = 0;
            for(int i=0; i<Ni; i++){
                iArr[i] = input.next();
            }
            int Nr = input.nextInt();
            Map<Integer,Map<Integer,String>> rMap = new TreeMap<>();
            while(Nr-->0){
                Map<Integer,String> iMap = new TreeMap<>();
                rMap.put(input.nextInt(),iMap);
            }
            for(Integer key : rMap.keySet()){
                for(int i=0; i<Ni; i++){
                    if(iArr[i].contains(key+"")){
                        rMap.get(key).put(i,iArr[i]);
                        count+=2;
                    }
                }
            }

            for(Integer key : rMap.keySet()){
                if(rMap.get(key).size()!=0){
                    count +=2;
                }
            }
            System.out.print(count+" ");
            for(Integer key : rMap.keySet()){
                int len = rMap.get(key).size();
                if(len>0){
                    Map<Integer,String> imap = rMap.get(key);
                    System.out.print(key+" "+len+" ");
                    for(Map.Entry<Integer,String > entry : imap.entrySet()){
                        System.out.print(entry.getKey()+" "+entry.getValue()+" ");
                    }
                }

            }
        }

    }
}
