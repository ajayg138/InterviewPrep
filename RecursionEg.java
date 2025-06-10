public class RecursionEg {
//    public static void print(){
//        System.out.println("1");
//        print();
//    }

    static int cnt=0;
    public static void print(){
        if(cnt==3){
            return;
        }
        System.out.println(cnt);
        cnt++;
        print();
    }

    public static void main(String[] args) {
        print();
    }
}
