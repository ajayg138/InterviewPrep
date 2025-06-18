import java.util.HashMap;
import java.util.Map;

public class HighestLowestFreq {

    public static void printMap(int[] arr){

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }

        int maxFreq = 0, minFreq=arr.length;
        int maxEle=0, minEle=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
//            System.out.println(entry.getKey()+"-->"+entry.getValue());
        int count=entry.getValue();
        int element=entry.getKey();

        if(count > maxFreq){
            maxEle=element;
            maxFreq=count;
        }

        if(count < minFreq){
            minEle=element;
            minFreq=count;
        }
        }
        System.out.println("Highest Frequency Element: "+maxEle);
        System.out.println("Minimum Frequency Element "+minEle);
    }


    public static void main(String[] args) {
        int[] arr={10,5,10,15,10,5,10,10};
        printMap(arr);
    }
}
