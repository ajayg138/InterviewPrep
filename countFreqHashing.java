import java.util.Scanner;

public class countFreqHashing {

    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter n: ");
//        int n=sc.nextInt();
//
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//
//        int[] hash = new int[13];
//        for(int i=0;i<n;i++){
//            hash[arr[i]] += 1;
//        }
//
//        System.out.print("Enter q: ");
//        int q=sc.nextInt();
//
//        while(q-->0){
//            int number=sc.nextInt();
//            System.out.println(hash[number]);
//
//        }


        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int[] hash=new int[13];
        for(int i=0;i<n;i++){
            hash[arr[i]] += 1;
        }

        System.out.println("Enter q: ");
        int q=sc.nextInt();
        while (q-- > 0){
            int number = sc.nextInt();
            System.out.println(hash[number]);
        }
    }
}


