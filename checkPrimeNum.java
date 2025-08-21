import java.util.Scanner;

public class checkPrimeNum {
    public static void isPrime(int n){
        int div=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                div++;
            }
        }
        if(div==2){
            System.out.println("Prime...");
        }else{
            System.out.println("Not a Prime..");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        isPrime(n);
    }
}
