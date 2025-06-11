import java.util.Scanner;

public class FibonacciSeriesREc {

    public static int fibo(int n){
        if(n<=1){
            return n;
        }

        int last = fibo(n-1);
        int Slast = fibo(n-2);

        return last + Slast;
    }


    public static int fibGen(int n){
        if(n<=1){
            return n;
        }

        return fibGen(n-1) + fibGen(n-2);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();

//        for(int i=0;i<=n;i++){
//            System.out.print(fibo(i));
//            if(i != n){
//                System.out.print(", ");
//            }
//        }

//        System.out.println(fibGen(n));

        for(int i=0;i<=n;i++){
            System.out.print(fibGen(i));
            if(i != n){
                System.out.print(", ");
            }
        }
    }
}
