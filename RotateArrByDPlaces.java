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

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int Nplaces=8;

        rotateArr(arr,Nplaces);
    }
}
