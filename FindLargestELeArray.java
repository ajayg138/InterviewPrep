public class FindLargestELeArray {

    //1.by Sorting
    public static void giveLargest(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Largest Element: "+arr[arr.length-1]);

    }

    //2. comparison using Nested loop

    public static void printLargest(int[] arr){
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
                if (arr[i]>largest){
                    largest=arr[i];
            }
        }
        System.out.println(largest);
    }

    public static void main(String[] args) {
        int[] arr={3,2,1,5,22,10,1,20,2};
//        giveLargest(arr);
        printLargest(arr);
    }
}
