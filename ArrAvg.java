import java.util.Scanner;

public class ArrAvg {

    public static double printAvg(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        double avg=sum/arr.length;
        return avg;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        double ans=printAvg(arr);
        System.out.print("Average is: "+ans)    ;

    }
}
