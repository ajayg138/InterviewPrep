import java.util.Scanner;

public class CountFreq {

    //Iterating over Entire Array...
    public static int freq(int num,int[] arr){
        int count=0;

        for(int i=0;i<arr.length;i++){
            if(num==arr[i]){
                count++;
            }
        }

        return count++;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();

        int[] arr={1,2,3,4,5,1,4,5,6,1,34,4};
        int ans = freq(n,arr);

        System.out.println(ans);


    }
}
