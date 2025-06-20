import java.util.HashSet;

public class RemoveDuplicates {

    public static int[] giveUnique(int[] arr) {
        int[] temp = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[index++] = arr[i];
            }
        }

        // Copy unique values into a new array of correct size
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }


    //using HashSet
    public static void remove(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }

        for(int val:set){
            System.out.print(val+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={1,1,5,5,5,4,4,4,2,2,2,3,3};
        int ans[]=giveUnique(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

//        remove(arr);

    }
}
