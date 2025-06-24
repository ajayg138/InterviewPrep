import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ArrayUnion {

    public static HashSet<Integer> giveUnion(int[] arr1,int[] arr2){
//        ArrayList<Integer> list=new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        //for ArrayList
//        for(int i=0;i<arr1.length;i++){
//                if(!list.contains(arr1[i])){
//                    list.add(arr1[i]);
//                }
//        }
//
//        for(int i=0;i<arr2.length;i++){
//            if(!list.contains(arr2[i])){
//                list.add(arr2[i]);
//            }
//        }

        //for HashSet
        for(int i=0;i<arr1.length;i++){
                set.add(arr1[i]);
        }


        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }

        return set;
    }


    public static void main(String[] args) {
        int[] arr1={1,1,2,3,4,5};
        int[] arr2={2,3,4,4,5,6};
        System.out.print("Union is: "+ giveUnion(arr1,arr2));
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            l.add(arr1[i]);
        }

        Collections.reverse(l);
        System.out.println();
        System.out.println(l);

    }
}
