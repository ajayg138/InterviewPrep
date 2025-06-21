public class RotateArrByDPlaces {
    public static void rotateArr(int[] arr, int Nplaces){
//        for(int i=0;i<places;i++){
//            arr[arr.length-1]=arr[i];
//        }
//
//        for(int i=0;i<arr.length-places;i++){
//            arr[i]=arr[i+1];
//        }
//
//        //printing array
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i] +" ");
//        }

        //brute force...
        Nplaces =Nplaces%arr.length;   //Very Imp
        int[] temp=new int[Nplaces];
        for(int i=0;i<Nplaces;i++){
            temp[i]=arr[i];
        }

        for(int i=Nplaces;i<arr.length;i++){
            arr[i-Nplaces]=arr[i];
        }


//        int j=0;
//        for(int i=arr.length-Nplaces;i<arr.length;i++){
//            arr[i]=temp[j];
//            j++;
//        }
        for(int i=arr.length-Nplaces;i<arr.length;i++){
            arr[i]=temp[i-(arr.length-Nplaces)];
        }

        //printing Array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }


    public static void rotateArrayToLeft(int[] arr,int k){
        k=k%arr.length;

        //storing kth element
        int[] temp=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }

        //shifting element to left
        for(int i=k;i<arr.length;i++){
            arr[i-k]=arr[i];
        }


        //shifting temp to last
        int j=0;
        for(int i=arr.length-k;i<arr.length;i++){
            arr[i]=temp[j];
            j++;
        }

        //print array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void RotateArrayToRight(int[] arr,int k){

        k=k%arr.length;

        //storing in temp array
        int[] temp = new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[arr.length-k+i];
        }

        //shifting to right
        for(int i=arr.length-k-1;i>=0;i--){
            arr[k+i]=arr[i];
        }

        //shifting temp to first
        int j=0;
        for(int i=0;i<k;i++){
            arr[j]=temp[i];
            j++;
        }

        //print array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int Nplaces=8;

//        rotateArr(arr,Nplaces);
//        rotateArrayToLeft(arr,Nplaces);
        RotateArrayToRight(arr,Nplaces);
    }
}
