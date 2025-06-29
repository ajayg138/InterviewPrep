import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Anagram {

    //brute Force
//    public boolean checkAnagram(String str1, String str2){
//        if(str1.length() != str2.length()){
//            return false;
//        }
//
//        char[] arr1=str1.toCharArray();
//        char[] arr2=str2.toCharArray();
//
//        return Arrays.equals(arr1,arr2);
//    }



    //Optimal Approach
    public boolean checkAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> map1=new HashMap<>();
        HashMap<Character, Integer> map2=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=s.charAt(i);


            map1.put(ch1,map1.getOrDefault(ch1,0)+1);
            map2.put(ch2, map2.getOrDefault(ch2, 0)+1);
        }
        return map1.equals(map2);
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
