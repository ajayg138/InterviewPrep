import java.util.Scanner;

public class SumOfNumbers {
    public static int sum(int n){
        if(n>0){
            return n+sum(n-1);
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        int ans=sum(n);
        System.out.println(ans);

    }
}
