import java.util.Scanner;

public class FactorialRec {

    public static int fact(int n){
        if(n==0){
            return 1;
        }

        return n * fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        int ans=fact(n);
        System.out.print("Factorial of "+n+" is "+ans);

    }
}
