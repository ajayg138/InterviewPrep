import java.util.ArrayList;

public class ArrRev {

    public static ArrayList<Integer> giveReverse(int[] arr){
        ArrayList<Integer> list=new ArrayList<>();

        int i =0;
        int j =arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for(int num: arr){
            list.add(num);
        }
        return list;
    }

    public static ArrayList<Integer> returnReverse(int[] arr){
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=arr.length-1;i>=0;i--){
            list.add(arr[i]);
        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr1={5,4,3,2,1};
        int[] arr2={5,4,3,2,1};
        System.out.print("Reverse: "+giveReverse(arr1));
        System.out.println();
        System.out.print("Reverse: "+returnReverse(arr2));
    }
}
