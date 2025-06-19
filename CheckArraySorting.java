public class CheckArraySorting {

    public static boolean checkSorting(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr={1,2,4,6,77};
        boolean ans=checkSorting(arr);
        if(ans==true){
            System.out.print("Array is Sorted...");
        }else{
            System.out.println("Array is not Sorted...");
        }
    }
}
