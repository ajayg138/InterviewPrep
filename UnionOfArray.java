import java.util.ArrayList;
import java.util.HashSet;

public class UnionOfArray {
    public static ArrayList<Integer> unionPrint(int[] arr1,int[] arr2){
        ArrayList<Integer> List=new ArrayList<>();
        int n1=arr1.length;
        int n2=arr2.length;
//
//        if(n1<n2){
//            for(int i=0;i<n1;i++){
//                List.add(arr1[i]);
//            }
//        }else{
//            for(int i=0;i<n2;i++){
//                List.add(arr2[i]);
//            }
//        }
//
//        if(List.size() != n1) {
//            for (int i = 0; i < n1; i++) {
//                if (arr1[i] != List.get(i)) {
//                    List.add(arr1[i]);
//                }
//            }
//        }else {
//            for (int j = 0; j < n2; j++) {
//                if (arr2[j] != List.get(j)) {
//                    List.add(arr2[j]);
//                }
//            }
//        }

        for(int i=0;i<n1;i++){
            if(!List.contains(arr1[i])){
                List.add(arr1[i]);
            }
        }

        for(int i=0;i<n2;i++){
            if(!List.contains(arr2[i])){
                List.add(arr2[i]);
            }
        }

        return List;
    }



    public static int union(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        for(int j=0;j<arr2.length;j++){
            set.add(arr2[j]);
        }


        return set.size();
    }

    public static HashSet<Integer> giveUnion(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        for(int j=0;j<arr2.length;j++){
            set.add(arr2[j]);
        }


        return set;
    }

    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

//        System.out.println(union(arr1,arr2));
//        System.out.println(union(arr1,arr2));
        System.out.println(giveUnion(arr1,arr2));

    }
}
