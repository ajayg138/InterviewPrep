import java.util.Scanner;

public class Pattenrs {
    public static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
//        pattern1(n);
//        pattern2(n);
        pattern3(n);
    }
}
