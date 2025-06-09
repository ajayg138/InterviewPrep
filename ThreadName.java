class MyyThread extends Thread{

}

public class ThreadName {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        MyyThread t=new MyyThread();
        System.out.println(t.getName());
        Thread.currentThread().setName("Ajayyy");
        System.out.println(Thread.currentThread().getName());

    }
}
