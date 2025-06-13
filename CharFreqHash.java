import java.util.Scanner;

public class CharFreqHash {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String str=sc.nextLine();

        int[] hash=new int[26];
        for(int i=0;i<str.length();i++){
            char current = str.charAt(i);
            if (current >= 'a' && current <= 'z') {
                hash[current - 'a']++;
            }
        }

        System.out.print("Enter q: ");
        int q=sc.nextInt();
        sc.nextLine();
        while(q-- > 0){
            char ch=sc.nextLine().charAt(0);
            System.out.println(hash[ch-'a']);
        }
    }
}
