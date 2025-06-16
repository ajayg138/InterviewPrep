import java.util.Scanner;

public class CommonPrefix {

    public static String logestCommonPrefix(String[] strs){
        if(strs == null || strs.length == 0) return "";

        StringBuilder ans = new StringBuilder();

        for(int i=0;i<strs[0].length();i++){
            char ch = strs[0].charAt(i);

            for(int j=1;j<strs.length;j++){
                if(i >= strs[j].length() || strs[j].charAt(i) != ch){
                    return ans.toString();
                }
            }
            ans.append(ch);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] strs=new String[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter String "+(i+1) + ": ");
            strs[i] = sc.nextLine();
        }

        String result = logestCommonPrefix(strs);
        System.out.println("Logest Common Prefix: "+result);

    }
}
