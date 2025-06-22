import java.util.ArrayList;

public class PrintDup {
    public static ArrayList<Integer> giveDuplicates(int[] arr){
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    ans.add(arr[i]);
                    break;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,5,4,2,1,4,7,7};

        System.out.print(giveDuplicates(arr));

    }
}
