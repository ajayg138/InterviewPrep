class MyThread extends Thread{
    public void run(){
        System.out.print("No arg Run...");
    }
    public void run(int i){
        System.out.print("int arg run...");
    }
}


public class runMEthodOverloading {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();

    }

}
