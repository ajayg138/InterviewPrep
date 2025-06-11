import java.util.Scanner;

public class StrPalindrome {

    public static boolean checkPalindrome(String str, int i){
        int len=str.length();
        if(i>=len/2){
            return true;
        }

        if(str.charAt(i) != str.charAt(len-1-i)){
            return false;
        }
        return checkPalindrome(str,i+1);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String str=sc.nextLine();

        boolean ans=checkPalindrome(str,0);
        if(ans==true){
            System.out.print("String is Palindrome...");
        }else{
            System.out.print("String is not Palindrome...");
        }

    }
}
