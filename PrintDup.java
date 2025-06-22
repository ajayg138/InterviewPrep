import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PrintDup {
    //Brute Force
    public static ArrayList<Integer> giveDuplicates(int[] arr){
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    ans.add(arr[i]);
                    break;
                }
            }
        }

        return ans;
    }

    //Optimal
    public static ArrayList<Integer> returnDuplicates(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> res=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> ans:map.entrySet()){
            if(ans.getValue() != 1){
                res.add((ans.getKey()));
            }
        }
        return res;
    }

    //using HashSet

    public static ArrayList<Integer> getDup(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        boolean isDuplicate=false;
        ArrayList<Integer> res=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                isDuplicate=true;
                res.add(arr[i]);
            }else{
                set.add(arr[i]);
            }
        }
//        if(!isDuplicate){
//            System.out.print(-1);
//        }
        return res;

    }

    public static void main(String[] args) {
        int[] arr={1,5,4,2,7,};

        System.out.print(giveDuplicates(arr));
        System.out.println();
        System.out.print(returnDuplicates(arr));;
        System.out.println();
        System.out.print(getDup(arr));

    }
}
