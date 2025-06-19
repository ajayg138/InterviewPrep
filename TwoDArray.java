import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter Cols: ");
        int cols=sc.nextInt();

        int[][] numbers=new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }

        //output
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

        System.out.print("Enter Target: ");
        int target=sc.nextInt();

        //searching
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(numbers[i][j]==target){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
