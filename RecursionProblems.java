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

    public static int sumOfN(int n){
        if(n==0){
            return 0;
        }
        return n + sumOfN(n-1);

    }

    public static void paraSum(int i,int sum){
        if(i<1){
            System.out.print(sum);
            return;
        }

        paraSum(i-1,sum+i);
    }

    public static int factorialN(int n){
        if(n==0){
            return 1;
        }
        return n * factorialN(n-1);
    }

    public static void factNPara(int i,int fact){
        if(i<1){
            System.out.print(fact);
            return;
        }

        factNPara(i-1,fact*i);
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

//        System.out.println("sum is: "+sumOfN(n));
//        paraSum(n,0);
//        System.out.println("Factorial of "+n+" is: "+factorialN(n));
        factNPara(n,1);
        //checking
//        String s1=new String("Durga");
//        String s2=new String("Software");
//        String s3=s1;
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equals(s3));

    }
}
