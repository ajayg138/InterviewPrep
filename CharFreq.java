import java.util.Scanner;

public class CharFreq {

    public static int freq(char ch,String str){
        int cnt=0;

        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i)){
                cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String str=sc.nextLine();

        System.out.print("Enter Character to Find: ");
        char ch = sc.nextLine().charAt(0);
        int ans = freq(ch,str);

        System.out.println("Character "+ch+" appear "+ans +" in the "+str);

    }
}
