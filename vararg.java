public class vararg {
    public static void m1(int... x){
        System.out.println("Hello Ajay...");
    }

//   final synchronized strictfp public static void main(String[] args) {
       public static void main(String[] args) {
        m1();
        m1(3);
        m1(10);
        m1(18,12,12);
           System.out.println('a'+'b');
    }
}
