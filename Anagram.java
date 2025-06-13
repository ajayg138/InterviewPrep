import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    //brute Force
    public boolean checkAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();

        return Arrays.equals(arr1,arr2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter str1: ");
        String str1=sc.nextLine().toLowerCase();
        System.out.print("Enter str1: ");
        String str2=sc.nextLine().toLowerCase();

        Anagram obj=new Anagram();
        boolean ans=obj.checkAnagram(str1,str2);
        if(ans==true) {
            System.out.println("Entered Strings are Anagram..");
        }else{
            System.out.println("Not an Anagram...");
        }

    }
}
