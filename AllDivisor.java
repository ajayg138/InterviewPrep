import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AllDivisor {
//
//    //BruteForce
//    public static void divisor(int n){
//        for(int i=1;i<=n;i++){
//            if(n%i==0){
//                System.out.println(i);
//            }
//        }
//    }


    //Optimal
    public static void divisor(int n){
        List<Integer> div=new ArrayList<>();

//        for(int i=1;i<=Math.sqrt(n);i++){
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                div.add(i);
                if(n/i != i){
                    div.add(n/i);
                }
            }
        }

        Collections.sort(div);
        for(int d:div){
            System.out.println(d);
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        divisor(n);

    }
}
