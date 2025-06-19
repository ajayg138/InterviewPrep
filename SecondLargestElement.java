import java.util.HashSet;
import java.util.Scanner;

public class SecondLargestElement {

    //Brute Force
    public static void printLargest(int[] arr){

        //sort
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int sLargest=arr[arr.length-1];

        for(int i=arr.length-1;i>0;i--){
            if(arr[i] != arr[i-1]){
                sLargest=arr[i-1];
                break;
            }
        }
        System.out.print(sLargest);
    }

    //better
    public static void giveSLargest(int[] arr){
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }

        int secLargest=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secLargest && arr[i]!=largest){
                secLargest=arr[i];
            }
        }

        System.out.print("Second Largest Element is: "+secLargest);
    }

    public static void returnSecondLargest(int[] arr){
        int largest=arr[0];
        int secLargest=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest ){
                secLargest=largest;
                largest=arr[i];
            } else if (arr[i]>secLargest && secLargest!=largest) {
                secLargest=arr[i];
            }
        }
        System.out.print("Second Largest: "+secLargest);
    }

    public static void main(String[] args) {
        int[] arr={1,2,4,7,7,5,6,8};
//        printLargest(arr);
//        giveSLargest(arr);
        returnSecondLargest(arr);
    }
}
