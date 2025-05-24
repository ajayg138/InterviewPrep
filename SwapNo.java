public class SwapNo {
    public static void swapping(int a,int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = "+a);
        System.out.print("b = "+b);


    }

    public static void main(String[] args) {
        swapping(5,2);

    }
}
