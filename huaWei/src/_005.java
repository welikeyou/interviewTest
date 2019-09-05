import java.util.*;
public class _005{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Errors> errorList = new ArrayList<>();
        while(input.hasNextLine()){
            String inputStr = input.nextLine();
           if(inputStr.equals("")){
               break;
           }
           String[] inputArr = inputStr.split("\\s");
            String fileName = "";
            int indexOfSlash = inputArr[0].lastIndexOf("\\");
            if(indexOfSlash<0){
                fileName = inputArr[0];
            }
            else{
                fileName = inputArr[0].substring(indexOfSlash+1);
            }
            String line = inputArr[1];
            boolean isSame = false;
            for(int i=0; i<errorList.size();i++){
                if(errorList.get(i).fileName.equals(fileName)&&errorList.get(i).line.equals(line)){
                    errorList.get(i).amount+=1;
                    isSame = true;
                    break;
                }
            }
            if(!isSame){
                Errors error1 = new Errors(fileName, line);
                errorList.add(error1);
            }

        }

        Collections.sort(errorList);
        int len = Math.min(errorList.size(),8);
        for(int i=0; i<len; i++){
            String fileName=errorList.get(i).fileName;
            if(fileName.length()>16){
                fileName = fileName.substring(fileName.length()-16);
            }
            System.out.println(fileName+" "+errorList.get(i).line+" "+errorList.get(i).amount);
        }
    }
}
class Errors implements Comparable<Errors>{
    String fileName="";
    String line="";
    int amount=1;
    public Errors(String fileName, String line){
        this.fileName = fileName;
        this.line = line;
    }
    @Override
    public int compareTo(Errors other){
        int rs= other.amount - this.amount;
        return rs;
    }
}