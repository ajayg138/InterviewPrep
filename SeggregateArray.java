public class SeggregateArray {

    public static void seggrateArr(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Move start forward if it's already 0---RIGHT POSITION
            while(arr[start]==0 && start<end){
                start++;
            }

            // Move end backward if it's already 1---LEFT POSITION
            while (arr[end]==1 && start<end){
                end--;
            }
            if (start<end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //USING for LOOP

    public static void seg(int[] arr){
        int j=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr[j++]=arr[i];
            }
        }

        while (j<arr.length){
            arr[j++]=1;
        }

        for(int num:arr){
            System.out.print(num+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={0,1,0,1,0,0,1,0,0,0,0,0};
        seggrateArr(arr);
        System.out.println();
        System.out.println("hello");
        seg(arr);

    }
}
