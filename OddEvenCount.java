import java.util.Scanner;

public class OddEvenCount{
    public static int checkEvenOdd(int[] arr){
        int oddCOunt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 != 0){
                oddCOunt++;
            }
        }
        return oddCOunt;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int oddAns=checkEvenOdd(arr);
        int evenAns=arr.length-oddAns;

        System.out.println(oddAns+" "+evenAns);

    }
}
