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
        for(int i=1;i<=n;i++){
            int num=1;
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();

        }
    }

    public static void pattern4(int n){
//        int num=1;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
//                System.out.print(num+" ");
                System.out.print(i+" ");
            }

            System.out.println();
//            num++;
        }
    }

    public static void pattern5(int n){
        for(int i=0;i<n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n){
        for(int i=1;i<=n;i++){
//            int num=1;
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
//                num++;
            }
            System.out.println();
        }
    }

    public static void pattern7(int n){
        for(int i=0;i<n;i++){
            //spaces
            for(int j=n-i-1;j>=0;j--){
                System.out.print(" ");
            }

            //stars
            for(int j=1;j<=2*i+1;j++){
                System.out.print("*");
            }



            System.out.println();
        }
    }



    public static void pattern8(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*(n-i)-1;j++){
                System.out.print("*");
            }

//            for(int j=0;j<i;j++){
//                System.out.print(" ");
//            }
            System.out.println();
        }
    }

    public static void pattern9(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
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

    public static void pattern10(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }


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


    public static void pattern11(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern12(int n){
        for(int i=1;i<=2*n-1;i++){
            int stars=i;
            if(i>n){
                stars=2*n-i;
            }
            for(int j=0;j<stars;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern13(int n){
        int start=1;
        for(int i=0;i<n;i++){
            if(i%2==0) start=1;
            else start=0;
            for(int j=0;j<=i;j++){
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();
        }
    }

    public static void pattern14(int n){
        int spaces=2*(n-1);
        for(int i=1;i<=n;i++){
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }

            //spaces
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }


            //numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            spaces -= 2;
        }
    }


    public static void pattern15(int n){
        int spaces=2*(n-1);
        for(int i=1;i<=n;i++){
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }


            //spaces
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }

            //numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            spaces -= 2;
        }
    }

    public static void pattern16(int n){
        int num=1;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();

        }
    }

    public static void pattern17(int n){

//        for(int i=1;i<=n;i++){
//            char ch='A';
//            for(int j=1;j<=i;j++){
//                System.out.print(ch+" ");
//                ch++;
//            }
//            System.out.println();
//        }
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void pattern18(int n){
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+(n-i-1);ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void pattern19(int n) {
        char ch='A';
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <=i; j++) {
                System.out.print(ch+" ");

            }
            System.out.println();
            ch++;

        }
    }

    public static void pattern20(int n){
        for(int i=0;i<n;i++){
            //spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            //characters
            char ch='A';
            int breakpt=(2*i+1)/2;
            for(int j=1;j<=2*i+1;j++){
                System.out.print(ch);
                if(j<=breakpt) ch++;
                else ch--;
            }
            System.out.println();
        }
    }

        public static void pattern21(int n){
            for(int i=0;i<n;i++){
                for(char ch=(char)('E'- i);ch<='E';ch++){
                    System.out.print(ch);
                }
                System.out.println();
            }
        }


        public static void pattern22(int n){

        for(int i=0;i<n;i++){

            //stars
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }


            //spaces
            for(int j=0;j<2*i;j++){
                System.out.print(" ");

            }


            //stars
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }


            System.out.println();


        }

        for(int i=0;i<n;i++){
            //stars
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }

            //spaces
            for(int j=0;j<2*(n-i-1);j++){
                System.out.print(" ");
            }

            //stars
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
        }

        public static void pattern23(int n){
        int space = 2*n-2;
            for(int i=1;i<=2*n-1;i++){
                int stars=i;
                if(i>n) stars=2*n-i;

                //stars
                for(int j=1;j<=stars;j++){
                    System.out.print("*");
                }

                //spaces
                for(int j=1;j<=space;j++){
                    System.out.print(" ");
                }


                //stars
                for(int j=1;j<=stars;j++){
                    System.out.print("*");
                }
                System.out.println();
                if(i<n) space -= 2;
                else space += 2;
            }
        }

        public static void pattern24(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        }

//        public static void pattern25(int n){
//        for(int i=0;i<2*n-1;i++){
//            for(int j=0;j<2*n-1;j++){
//                int top=i;
//                int left=j;
//                int right=(2*n-2)-j;
//                int down=(2*n-2)-i;
//                System.out.print(n-min(min(top,down)), min(left,right));
//            }
//            System.out.println();
//        }
//        }

    public static void pattern25(int n) {
        int size = 2 * n - 1;
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                int top = i;
                int left = j;
                int right = size - 1 - j;
                int down = size - 1 - i;

                int minDistance = Math.min(Math.min(top, down), Math.min(left, right));
                System.out.print(n - minDistance);
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
//        RevPyramid(n);
//        FullPyramid(n);
//        FullTriangle(n);
//        NoRightAngleTri(n);
//        TwoTriangle(n);
//        NumTriangle(n);
//            AlphaTriangle(n);
//        InvertedAlphaTrianagle(n);
//        RepAlphaTr(n);
//        pattern1(n);
//        pattern2(n);
//        pattern3(n);
//        pattern4(n);
//        pattern5(n);
//        pattern6(n);
//        pattern7(n);
//        pattern8(n);
//        pattern9(n);
//        pattern10(n);
//        pattern11(n);
//        pattern12(n);
//        pattern13(n);
//        pattern14(n);
//        pattern15(n);
//        pattern16(n);
//        pattern17(n);
//        pattern18(n);
//        pattern19(n);
//        pattern20(n);
//        pattern21(n);
//        pattern22(n);
//        pattern23(n);
//        pattern24(n);
        pattern25(n);
    }
}
