import java.util.ArrayList;

public class DeleteEleArray {

    public static ArrayList<Integer> deletedArr(int[] arr,int pos){
        ArrayList<Integer> newArr=new ArrayList<>();
        if(pos < 0 || pos>=arr.length){
            System.out.println("Invalid position to delete...");
            return newArr;
        }

//        int[] newArr=new int[arr.length-1];


        for(int i=0,j=0;i<arr.length;i++,j++){
            if(i != pos){
                newArr.add(arr[i]);
            }
        }
        return newArr;
    }


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int pos=5;

        System.out.println(deletedArr(arr,pos));


    }
}
