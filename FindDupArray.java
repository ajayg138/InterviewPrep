import java.util.HashMap;
import java.util.Map;

public class FindDupArray {

    public static void printDuplicate(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+", ");
                }
            }
        }
    }

    public static void printDup(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println("Print All Entries...");
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getValue()+"-> "+entry.getKey());
        }
        System.out.println("Print duplicate Entries...");
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getKey() < 1) {
                System.out.println(entry.getValue() + "-> " + entry.getKey());
            }
        }
        System.out.println("Print non-duplicate Entries...");
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getKey() < 1) {
                System.out.println(entry.getValue() + "-> " + entry.getKey());
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,5,4,2,1,4,7,7};
//        printDuplicate(arr);
        printDup(arr);

    }
}
