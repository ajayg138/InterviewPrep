import java.util.ArrayList;
import java.util.Scanner;

public class PrintArr {

    public static ArrayList<Integer> returnArray(int[] arr){
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }

        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println();
        System.out.print("Print array: "+returnArray(arr));

    }
}
