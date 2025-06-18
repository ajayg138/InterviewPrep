import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOfArray {

    public static HashSet<Integer> giveIntersection(int[] arr1,int[] arr2){
//        ArrayList<Integer> List = new ArrayList<>();
        HashSet<Integer> List=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    List.add(arr1[i]);
                }
            }
        }
        return List;
    }


    public static ArrayList<Integer> printIntersection(int[] arr1,int[] arr2){
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> List=new ArrayList<>();

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                List.add(arr2[i]);
                set.remove(arr2[i]);
            }
        }

        return List;

    }

    public static void main(String[] args) {
        int[] arr1={7,3,9};
        int[] arr2={6,3,9,2,9,4};
//        System.out.println(giveIntersection(arr1,arr2));
        System.out.println(printIntersection(arr1,arr2));
    }
}
