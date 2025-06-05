import javax.sound.sampled.Line;

public class Complex {
    static void Linear(){
        int[] arr={1,4,2,5,3,3,4,5,5};
        for(int i=0;i<arr.length;i++){
            System.out.print(i+1 +" times"+ '\t');
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        Linear();
    }
}
