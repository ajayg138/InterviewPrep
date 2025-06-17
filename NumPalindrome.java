import java.util.Scanner;

public class NumPalindrome {
    public static boolean checkPalindrome(int n){
        int dupN=n;
        int rev=0;
        while (n>0){
            int ld=n%10;
            rev=(rev*10)+ld;
            n=n/10;
        }

        return rev==dupN;

    }

    public static boolean check(int n){
        String str=Integer.toString(Math.abs(n));
        int len=str.length();

        for(int i=0;i<len/2;i++){
            if (str.charAt(i) != str.charAt(len-i-1))
                return false;
        }

        return true;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        boolean ans=check(n);
        if (ans==true){
            System.out.println("Palindrome...");
        }else{
            System.out.println("Not a Palindrome...");
        }



    }
}
