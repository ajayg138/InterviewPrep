import java.util.Scanner;

public class ArrayConcate {

    public static int[] concateArr(int[] arr){
        int len=arr.length;
        int[] ans=new int[len*2];

        for(int i=0;i<len;i++){
            ans[i]=arr[i];
            ans[i+len]=arr[i];
        }
        return ans;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Element: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] con = concateArr(arr);
        for (int i = 0; i < con.length; i++) {
            System.out.print(con[i] + " ");
        }
    }
}
