//import java.util.Scanner;
import java.util.*;
public class ContainsDuplicate {


    //Brute Force
//    public static boolean checkDuplicate(int[] arr){
//
//        //Brute Force
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    //Optimal
    public static boolean checkDuplicate(int[] arr){
        HashSet<Integer> seen=new HashSet<>();

        for(int i:arr){
            if(seen.contains(i)){
                return true;
            }
            seen.add(i);
        }
        return false;
    }


        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of Elements: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }

        boolean ans=checkDuplicate(arr);
        if(ans==true){
            System.out.println("Contains Duplicates...");
        }else{
            System.out.println("Doesn't contain Duplicates...");
        }

    }
}
