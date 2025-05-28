public class SwitchSt {

    public static void switchEg(int x){

        switch (x){
            case 1:
                System.out.println("switch 1...");
                break;
            case 2:
                System.out.println("switch 2...");
                break;
            case 3:
                System.out.println("switch 3...");

            case 4:
                System.out.println("switch 4...");
                break;
            case 5:
                System.out.println("switch 5...");
                break;
            case 6:
                System.out.println("switch 6...");
                break;
            default:
                System.out.println("Invalid Input...");
        }
    }

    public static void main(String[] args) {
    switchEg(3);
//    for(int i=0;;i++){
//        System.out.println(i);
//    }

        for(int i=1;i<=10;i++){
            if(i%2==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
