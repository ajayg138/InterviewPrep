public class SwapArrRec {

    //usinng two variables
    public static void swap(int[] arr,int start,int end){
        if(start >= end){
            return;
        }

        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        swap(arr,start+1,end-1);
    }

    //using single variable

    public static void swapArr(int[] arr,int i){
        int n=arr.length;
        if(i >= n/2){
            return;
        }


        int temp=arr[i];
        arr[i]=arr[n-1-i];
        arr[n-1-i]=temp;

        swapArr(arr,i+1);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int len=arr.length-1;

//        swap(arr,0,len);
        swapArr(arr,0);

        //printing
        for(int ele:arr){
            System.out.print(ele+", ");
        }

    }
}
