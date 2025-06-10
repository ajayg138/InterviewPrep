import java.util.Scanner;

public class CheckPrimeNo {

    //Brute Force
//    public static boolean check(int n){
//        int cnt=0;
//        for(int i=1;i<=n;i++){
//            if(n%i==0){
//                cnt++;
//            }
//        }
//
//        if(cnt==2){
//            return true;
//        }else{
//            return false;
//        }
//    }
    public static boolean check(int n){
        int cnt=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                cnt++;
                if((n/i) != i){
                    cnt++;
                }
            }
        }

        if(cnt==2){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        boolean val=check(n);
        if (val==true){
            System.out.print("Prime...");
        }else {
            System.out.print("Not a Prime...");
        }

    }
}
