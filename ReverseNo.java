import java.util.Scanner;

public class ReverseNo {

    public static int rev(int n){
        int revN=0;
        while(n>0){
            int lastDigit=n%10;
            revN=(revN*10)+lastDigit;
            n=n/10;
        }
        return revN;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        int revserN=rev(n);
        System.out.print(revserN);
    }
}
