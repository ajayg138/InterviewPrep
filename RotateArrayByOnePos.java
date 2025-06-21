public class RotateArrayByOnePos {

    public static void rotateArray(int[] arr){
//        int last=arr[arr.length-1];
//        for(int i=arr.length-1;i>0;i--){
//            arr[i]=arr[i-1];
//        }
//        arr[0]=last;

        int first=arr[0];
//        for(int i=0;i<arr.length-1;i++){
//            arr[i]=arr[i+1];
//        }
//        arr[arr.length-1]=first;

        for(int i=1;i<=arr.length-1;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=first;

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        rotateArray(arr);
    }
}
