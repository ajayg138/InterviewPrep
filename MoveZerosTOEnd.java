import java.util.ArrayList;

public class MoveZerosTOEnd {

    public static int[] moveZero(int[] arr){
        int j=0;
//        ArrayList<Integer> res=new ArrayList<>();
//        int[] res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                arr[j++]=arr[i];
            }
        }

        while (j<arr.length){
            arr[j++]=0;
        }


        return arr;
    }


    public static int[] zeroAtLast(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){

            //at start there is number not equal to 0
            while(arr[start] != 0 && start<end){
                start++;
            }

            //at end there is 0
            while(arr[end] == 0 && start<end){
                end--;
            }

            if(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        return arr;
    }

    public static ArrayList<Integer> zeroAtEnd(int[] arr){

        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] != 0 && arr[i]==0){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int num:arr){
            list.add(num);
        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr={0,0,0,0,1,0,2,3,2,0,0,4,5,1};
        int[] ans=moveZero(arr);
        System.out.println("using for loop");
        ArrayList<Integer> s=new ArrayList<>();
        for(int num:ans){
            s.add(num);
        }
        System.out.print(s);
        System.out.println();
        System.out.println("Using while Loop");
        int[] res=zeroAtLast(arr);
        ArrayList<Integer> r=new ArrayList<>();
        for(int n:res){
            r.add(n);
        }
        System.out.print(r);
        System.out.println();
        System.out.println("Optimize...");
        System.out.print(zeroAtEnd(arr));

    }
}
