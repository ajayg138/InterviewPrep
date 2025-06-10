import java.util.Scanner;

public class RecursionProblems {

    public static void printName(int n){
        if(n>0){
            System.out.println("Ajay...");
            printName(n-1);
        }
    }


    public static void printNum(int i,int n){
        if(i<=n){
            System.out.println(i);
            printNum(i+1,n);
        }
    }

    public static void printNumRev(int n){
        if(n>0){
            System.out.println(n);
            printNumRev(n-1);
        }
    }

    public static void printNumBackTracking(int i,int n){
        if(i<1){
            return;
        }
        printNumBackTracking(i-1,n);
        System.out.println(i);
    }

    public static void printNumBackTrackingRev(int i,int n){
        if(i>n){
            return;
        }
        printNumBackTrackingRev(i+1,n);
        System.out.println(i);

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
//        printName(n);
//        printNum(1,n);
//        printNumRev(n);
//        printNumBackTracking(n,n);
//        printNumBackTrackingRev(1,n);

        //checking
//        String s1=new String("Durga");
//        String s2=new String("Software");
//        String s3=s1;
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equals(s3));

    }
}
