import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class digitsInWords {

    public static void printValue(char digit){
        switch (digit){

            case '0':
                System.out.print("Zero ");
                break;
            case '1':
                System.out.print("One ");
                break;
            case '2':
                System.out.print("Two ");
                break;
            case '3':
                System.out.print("Three ");
                break;
            case '4':
                System.out.print("Four ");
                break;
            case '5':
                System.out.print("Five ");
                break;
            case '6':
                System.out.print("Six ");
                break;
            case '7':
                System.out.print("Seven ");
                break;
            case '8':
                System.out.print("Eight ");
                break;
            case '9':
                System.out.print("Nine ");
                break;
        }
    }

    public static void printWords(String N){
        for(int i=0;i<N.length();i++){
            printValue(N.charAt(i));
        }
    }

    //using HashMap

    public static void print(String N){
        Map<Character, String> digits = new HashMap<Character, String>(){{
           put('1',"One");
           put('2',"Two");
            put('3',"Three");
            put('4',"Four");
            put('5',"Five");
            put('6',"Six");
            put('7',"Seven");
            put('8',"Eight");
            put('9',"Nine");
        }};

        for(char number:N.toCharArray()){
            System.out.print(digits.get(number)+" ");
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N: ");
        String N=sc.nextLine();

//        printWords(N);
        print(N);

    }
}

