public class StringToNo {

    public static int add(String str){
        int add=0;
        for(int i=0;i<=str.length();i++){
            if(str.charAt(i)==Character.isDigit(str.charAt(i))){
                add++;
            }
        }

        return add;
    }

    public static void main(String[] args) {
        String str="2h3m4n5";

    }
}
