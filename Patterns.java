import java.util.Scanner;

public class Patterns {

    public static void square(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void RTriangle(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void NoTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void SameNoTri(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }


    public static void RevTriangle(int n){
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void RevNoTriangle(int n){
        for(int i=n;i>=1;i--){
//            for(int j=i;j>=1;j--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void Pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            for(int j=n-i;j>=0;j--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void RevPyramid(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*(n-i)-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
//        square(n);
//        RTriangle(n);
//        NoTriangle(n);
//        SameNoTri(n);
//        RevTriangle(n);
//        RevNoTriangle(n);
//        Pyramid(n);
//        RevTriangle(n);
        RevPyramid(n);
    }
}
