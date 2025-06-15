import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

//    public static int[] giveSum(int[] arr, int target){
//        int[] ans=new int[2];
//
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]+arr[j]==target){
//                    ans[0]=i;
//                    ans[1]=j;
//                    return ans;
//                }
//            }
//        }
//        return ans;
//    }

    //optimize solution
    public static int[] giveSum(int[] arr,int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int complement=target - arr[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(arr[i],i);
        }
        return new int[] {-1,-1};
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

//        int[] sum=giveSum(arr,target);
//        for(int i=0;i<sum.length;i++){
//            System.out.print(sum[i]+" ");
//        }

        int result[]=giveSum(arr,target);

        if(result[0] == -1){
            System.out.println("No two sum solution found.");
        }else{
            System.out.println("Indices: "+result[0]+" "+result[1]);
        }

    }
}
