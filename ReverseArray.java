import java.util.ArrayList;


public class ReverseArray {

    public static int[] revArray(int[] arr){
        int[] ans=new int[arr.length];
//        int j=0;
//        for(int i=arr.length-1;i>=0;i--){
//
//            ans[j]=arr[i];
//            j++;
//        }

        for(int i=arr.length-1,j=0;i>=0;i--,j++){
            ans[j]=arr[i];
        }

        return ans;
    }
    public static ArrayList<Integer> revArrayy(int[] arr){
        ArrayList<Integer> rev=new ArrayList<>();

        for(int i=arr.length-1;i>=0;i--){
            rev.add(arr[i]);
        }

        return rev;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};

        int[] revArr=revArray(arr);
        for(int i=0;i<revArr.length;i++){
            System.out.print(revArr[i]+", ");
        }

//        System.out.println(revArrayy(arr));


    }
}
