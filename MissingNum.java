import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MissingNum {
    public static void findMissing(int[] arr,int n){

        for(int i=1;i<=n;i++){
            boolean found=false;
            for(int j=0;j<n-1;j++){
                if(arr[j] == i){
                    found=true;
                    break;
                }
            }
            if(!found){
                System.out.print("Missing No.: "+i);
            }
        }
    }

    public static void printMissing(int[] arr,int n){

        HashSet<Integer> set=new HashSet<>();

        for(int num:arr){
            set.add(num);
        }

        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                System.out.print("Missing No.: "+i);
            }
        }
    }

    public static void giveMissing(int[] arr,int n){
        HashMap<Integer, Integer> map=new HashMap<>();

        for (int i = 1; i <= n; i++) {
            map.put(i, 0);
        }

        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            }
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue() == 0){
                System.out.print("Missing No.: "+entry.getKey());
            }
        }
    }

    public static void returnMissing(int[] arr,int n){
        int sum=n*(n+1)/2;
//        System.out.println(sum);
        int dumSum=0;
        for(int i=0;i<n-1;i++){
            dumSum += arr[i];
        }

        System.out.print("Missing No.: "+(sum-dumSum));
    }
    public static int findMissingNumber(int[] arr) {
        int n = arr.length;
        int xorArray = 0;
        int xorFull = 0;

        // XOR all elements in the array
        for (int i = 0; i < n; i++) {
            xorArray ^= arr[i];
        }

        // XOR all numbers from 1 to n+1
        for (int i = 1; i <= n + 1; i++) {
            xorFull ^= i;
        }

        // XOR of both gives the missing number
        return xorArray ^ xorFull;
    }

    public static void main(String[] args) {
        int[] arr={1,2,4,5,3};
        int n=6;
        findMissing(arr,n);
        System.out.println();
        printMissing(arr,n);
        System.out.println();
        giveMissing(arr,n);
        System.out.println();
        returnMissing(arr,n);
        System.out.println();
        System.out.println("Missing number is: " + findMissingNumber(arr));


    }
}
