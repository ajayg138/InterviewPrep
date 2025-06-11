import java.util.Scanner;

public class FibonacciSeries {

    public static void fibo(int n){
        int first=0;
        int second=1;
        System.out.print(first+", ");
        if(n>=1)
            System.out.print(second+", ");
        for(int i=2;i<=n;i++){
            int next=first+second;
            System.out.print(next);
            if(i != n){
                System.out.print(", ");
            }
            first=second;
            second=next;
        }
    }



    //Revision

    public static void fibonacci(int n){
        int first=0;
        int second=1;

        System.out.print(first+", ");
        if(n >= 1){
            System.out.print(second + ", ");
        }

        for(int i=2;i<=n;i++){
            int next=first+second;
            System.out.print(next);
            if(i != n){
                System.out.print(", ");
            }
            first=second;
            second=next;
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
//        fibo(n);
        fibonacci(n);
    }
}
