import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayIntersection {

    public static ArrayList<Integer> giveIntersection(int[] arr1, int[] arr2){
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<arr1.length;i++){
            map.put(arr1[i], map.getOrDefault(arr1[i],0)+1);
        }

//        for(int i=0;i<arr2.length;i++){
//            map.put(arr2[i],map.getOrDefault(arr2[i],0)+1);
//        }
//
//        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
//            if(entry.getValue()!=1){
//                list.add(entry.getKey());
//            }
//        }

        // Traverse arr2 and check for intersection
        for (int i = 0; i < arr2.length; i++) {
            if (map.containsKey(arr2[i]) && map.get(arr2[i]) > 0) {
                list.add(arr2[i]);
                map.put(arr2[i], map.get(arr2[i]) - 1);  // Decrease count to avoid duplicates
            }
        }


        return list;
    }

    public static ArrayList<Integer> returnIntersection(int[] arr1,int[] arr2){
        ArrayList<Integer> list=new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                i++;
            } else if (arr2[j]<arr1[i]) {
                j++;
            }else{
                list.add(arr1[i]);
                i++;
                j++;
            }
        }

        return list;
    }


    public static void main(String[] args) {
        int[] arr1={1,1,2,3,4,5};
        int[] arr2={2,3,4,4,5,6};
        System.out.print("Intersection is: "+giveIntersection(arr1,arr2));

        System.out.println();
        System.out.print("Intersection is: "+returnIntersection(arr1,arr2));

    }
}
