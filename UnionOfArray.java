import java.util.ArrayList;

public class UnionOfArray {
    public static ArrayList<Integer> union(int[] arr1,int[] arr2){
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


    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        System.out.println(union(arr1,arr2));

    }
}
