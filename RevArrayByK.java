public class RevArrayByK {

    public static void reverse(int[] arr,int start, int end){

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static int[] reverseByK(int[] arr,int d){
        d=d%arr.length;

        reverse(arr,0,d-1);

        reverse(arr, d, arr.length-1);

        reverse(arr, 0, arr.length-1);

        return arr;
    }


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int d=3;

        System.out.println("ReverseArray: ");
        int[] ans=reverseByK(arr,d);
        for(int num: ans){
            System.out.print(num+" ");
        }
    }
}
