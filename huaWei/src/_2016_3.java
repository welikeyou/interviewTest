import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/6
 * Time:14:07
 * Introduction:数独
 */
public class _2016_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] grid  = new int[9][9];
        for(int i=0; i<9; i++){
            int sum = 0;
            int count0 = 0;
            int index = 0;
            for(int j=0; j<9; j++){
                grid[i][j] = input.nextInt();
                sum+=grid[i][j];
                if(grid[i][j]==0){
                    count0+=1;
                    index=j;
                }
            }
            if(count0==1){
                grid[i][index] = 45 - sum;
            }
        }
        Map<Integer,Integer>[][] mapArr = new HashMap[9][9];
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                Map<Integer,Integer> mapItem = new HashMap<>();
                if(grid[i][j]!=0){
                    mapArr[i][j] = mapItem;
                }else{
                    for(int k=1; k<=9;k++){
                        mapItem.put(k,1);
                    }
                    int indexi = (i/3)*3;
                    int indexj = (j/3)*3;
                    for(int x = indexi; x<indexi+3; x++){
                        for(int y= indexj; y<indexj+3; y++){
                            if(mapItem.size()==1){
                                break;
                            }
                            if(mapItem.containsKey(grid[x][y])){
                                mapItem.remove(grid[x][y]);
                            }
                        }
                    }
                }
            }
        }
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(mapArr[i][j].size()==1){
                    grid[i][j] = mapArr[i][j].get(0);
                    int indexi = (i/3)*3;
                    int indexj = (j/3)*3;
                    for(int x = indexi; x<indexi+3; x++){
                        for(int y= indexj; y<indexj+3; y++){
                            if(mapArr[x][y].containsKey(grid[i][j])){
                                mapArr[x][y].remove(grid[i][j]);
                            }
                        }
                    }

                }
            }
        }
        for(int i=0; i<9; i++){
            int sum = 0;
            int count0 = 0;
            int index = 0;
            for(int j=0; j<9; j++){
                sum+=grid[j][i];
                if(grid[j][i]==0){
                    count0+=1;
                    index=j;
                }
            }
            if(count0==1){
                grid[index][i] = 45 - sum;
            }
        }
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }


}
