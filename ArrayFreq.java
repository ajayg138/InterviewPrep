import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayFreq {

    //O(n)..using simple for loop
    public static int giveFreq(int[] arr,int target){
        int cnt=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                cnt++;
            }
        }

        return cnt;
    }


    //O(n)...Using HashMap

    public static void printFreq(int[] arr, int n){
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer,Integer>  entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    public static void main(String[] args) {
        int arr[] = {10,5,10,15,10,5};
        int target=2;
//        System.out.print(target+" ");
//        System.out.print(giveFreq(arr,target));
        int n=arr.length;
        printFreq(arr,n);

    }
}
