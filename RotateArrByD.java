import java.util.ArrayList;

public class RotateArrByD {

    //Optimal Approach

//    public static void rotateArr(int[] arr,int d){
//        int[] temp=new int[d];
//        int j=0;
//        for(int i=d;i>0;i--){
//            temp[j]=arr[i];
//            j++;
//        }
//
//        int[] temp1=new int[arr.length-d];
//        int x=0;
//        for(int i=arr.length-1;i<d;i--){
//            temp1[x]=arr[i];
//            x++;
//        }
//
//        ArrayList<Integer> rev=new ArrayList<>();
//
//        for(int i=0;i<temp.length;i++){
//            rev.add(temp[i]);
//        }
//
//        for(int i=temp.length;i<temp1.length;i++){
//            rev.add(temp1[i]);
//        }
//
//        for(int y:rev){
//            System.out.print(y);
//        }
//    }

    public static void reverse(int[] arr,int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void rotateArr(int[] arr,int d){
        int n=arr.length;
        d=d%n;

        //reverse till d
        reverse(arr,0,d-1);

        //reverse from d to end
        reverse(arr,d,n-1);

        //reverse entire array
        reverse(arr,0,n-1);

        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int d=3;

        rotateArr(arr,d);

    }
}
