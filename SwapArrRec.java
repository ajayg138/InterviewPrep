public class SwapArrRec {

    public static void swap(int[] arr,int start,int end){
        if(start >= end){
            return;
        }

        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        swap(arr,start+1,end-1);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int len=arr.length-1;

        swap(arr,0,len);

        //printing
        for(int ele:arr){
            System.out.print(ele+", ");
        }

    }
}
