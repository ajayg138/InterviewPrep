import java.util.Scanner;

public class CountDigits {

    public static int cntDigits(int n){
        int cnt=0;
        while(n>0){
            n=n/10;
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        int count=cntDigits(n);
        System.out.println(count);

    }
}
