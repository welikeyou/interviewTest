import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/5
 * Time:10:21
 * Introduction:
 */
public class test {
    public static void main(String[] args){
        Map<Integer,Integer> map = new HashMap<>();
        int[] arr ={1,2,4,4};
        for(int num : arr){

          //int val = map.get(num);// 如果没有该对象，将返回null，而如果将null赋值给int类型，将报空指针异常
            if(map.containsKey(num)){
                int val = map.get(num);
                map.put(num,val++);
            }else{
                map.put(num,1);
            }

        }
    }

}
