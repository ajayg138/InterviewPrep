import java.util.Scanner;

public class PalindromeNum {
    public static boolean checkPalindrome(int n){
        int dupN=n;
        int revNum=0;
        while(n>0){
            int ld=n%10;
            revNum=(revNum*10)+ld;
            n=n/10;
        }
        if(dupN==revNum){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        boolean val=checkPalindrome(n);
        if (val==true){
            System.out.print("Number is Palindrome...");
        }else{
            System.out.print("Number is not a Palindrome...");
        }


    }
}
