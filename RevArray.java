import java.util.ArrayList;
import java.util.Scanner;

public class RevArray {

    public static ArrayList<Integer> reverse(int[] arr){
        ArrayList<Integer> rev=new ArrayList<>();

        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        for(int num:arr){
            rev.add(num);
        }

        return rev;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter no. array element: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print(reverse(arr));

    }
}
