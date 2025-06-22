public class SumPairsInArray {

    public static void getPairs(int[] arr,int sum){

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.print("[ "+arr[i]+", "+arr[j]+" ]");
                    System.out.println();
                }
            }
        }
    }

    //optimize
//array is in sorted order
    public static void returnPairs(int[] arr,int sum){
        int low=0;
        int high=arr.length-1;

        while (low < high){
            if(arr[low]+arr[high]>sum){
                high--;
            } else if (arr[low]+arr[high]<sum) {
                low++;
            } else if (arr[low]+arr[high]==sum) {
                System.out.print(arr[low]+" "+arr[high]);
                System.out.println();
                low++;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int sum=9;
        getPairs(arr,sum);
        System.out.println();
        returnPairs(arr,sum);
    }
}
