import java.util.Scanner;

public class TwoSum {

    public static int[] giveSum(int[] arr, int target){
        int[] ans=new int[2];

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter "+i+"th Array Element: ");
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter Target: ");
        int target=sc.nextInt();

        int[] sum=giveSum(arr,target);
        for(int i=0;i<sum.length;i++){
            System.out.print(sum[i]+" ");
        }

    }
}
