import java.util.Scanner;

public class countVowels {

    public static int giveVowels(String str){
        int cnt=0;

        char[] charStr = str.toCharArray();
        for(int i=0;i<charStr.length;i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                cnt++;
            }
        }
        return cnt;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Str: ");
        String str=sc.nextLine();

        int ans=giveVowels(str);
        System.out.print(ans);

    }
}
