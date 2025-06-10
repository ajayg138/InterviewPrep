import java.util.Scanner;

public class ExtractDigits {

    public static void digitsextraction(int n){

        while(n>0){
            int digits=n%10;
            System.out.println(digits);
            n=n/10;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        digitsextraction(n);
    }
}
