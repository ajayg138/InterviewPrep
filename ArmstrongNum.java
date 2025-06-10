import java.util.Scanner;

public class ArmstrongNum {

    public static boolean checkArmNum(int n){
        int dupN=n;
        int count=0;


        int temp=n;
        while(temp>0){
            count++;
            temp=temp/10;
        }


        int ArmNum=0;
        temp=n;
        while(temp>0){
            int ld=temp%10;
            ArmNum += Math.pow(ld,count);
            temp = temp/10;
        }

        if(dupN==ArmNum){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        boolean check=checkArmNum(n);

        if(check==true){
            System.out.print("Armstrong Number...");
        }else{
            System.out.print("Not an Armstrong Number...");
        }
    }
}
