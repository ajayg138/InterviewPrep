import java.util.Scanner;

public class GCD {

    //brute force
//    public static int greatestCommonDivisor(int n1,int n2){
//        int GCD=1;
//
//        for(int i =1;i<=Math.min(n1,n2);i++){
//            if(n1%i==0 && n2%i==0){
//                GCD=i;
//            }
//        }
//        return GCD;
//    }

    public static int greatestCommonDivisor(int n1, int n2){
        int GCD=1;
        for(int i=Math.min(n1,n2);i>=1;i--){
            if(n1%i==0 && n2%i==0){
                GCD=i;
                break;
            }
        }
        return GCD;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1=sc.nextInt();
        System.out.print("Enter n2: ");
        int n2=sc.nextInt();
        int ans=greatestCommonDivisor(n1,n2);
        System.out.print("GCD is: "+ans);

    }
}
