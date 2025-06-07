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

    public static void FullPyramid(int n){
        //Straight
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Inverted
        for(int i=0;i<n;i++){
            //spaces
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<2*(n-i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void FullTriangle(int n){


        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void NoRightAngleTri(int n){
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
////                System.out.print("* ");
//                if(j % 2 == 1){
//                    System.out.print("1 ");
//                }else{
//                    System.out.print("0 ");
//                }
//            }
//            System.out.println();
//        }
        for (int i = 1; i <= n; i++) {
            int val = (i % 2 == 0) ? 0 : 1; // Start with 1 if odd row, else 0
            for (int j = 1; j <= i; j++) {
                System.out.print(val + " ");
                val = 1 - val; // Toggle between 1 and 0
            }
            System.out.println();
        }
    }


    public static void TwoTriangle(int n){
        for(int i=1;i<=n;i++){
            //number printing
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //spaces
            for(int j=2*(n-i);j>=0;j--){
                System.out.print(" ");
            }
            //number printing
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void NumTriangle(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    public static void AlphaTriangle(int n){


        for(int i=1;i<=n;i++){
            char ch='A';
            for(int j=1;j<=i;j++){
                System.out.print(ch+ " ");
                ch++;
            }
            System.out.println();
        }
    }


    public static void InvertedAlphaTrianagle(int n){
        for(int i=0;i<n;i++){
            char ch='A';
            for(int j=n;j>i;j--){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
    public static void RepAlphaTr(int n){
        char ch='A';
        for(int i=0;i<n;i++){


            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");

            }
            System.out.println();
            ch++;

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
//        RevPyramid(n);
//        FullPyramid(n);
//        FullTriangle(n);
//        NoRightAngleTri(n);
//        TwoTriangle(n);
//        NumTriangle(n);
//            AlphaTriangle(n);
//        InvertedAlphaTrianagle(n);
        RepAlphaTr(n);
    }
}
