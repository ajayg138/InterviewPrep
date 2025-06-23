public class LinearSearchInArray {

    public static int search(int[] arr,int num){
        for(int i=0;i<arr.length;i++){
            if(num==arr[i]){
                return i;
//                break;/
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={6,7,8,4,4,4,4,1};
        int num=4;

        System.out.print(num+" found at index "+search(arr,num));
    }
}
