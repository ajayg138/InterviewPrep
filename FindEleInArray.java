import java.util.Scanner;

public class FindEleInArray {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Target: ");
        int target=sc.nextInt();
        System.out.print("Enter n: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            if(arr[i]==target){
                System.out.print(i);
                break;
            }
        }


    }
}
