public class PrintCommonEle3Array {
    //bruteforce O(n^3)
    public static void returnCommon(int[] arr1,int[] arr2,int[] arr3){

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                for(int k=0;k<arr3.length;k++){
                    if(arr1[i]==arr2[j] && arr2[j]==arr3[k]){
                        System.out.print(arr1[i]+" ");
                    }
                }
            }
        }
    }


    public static void giveCommon(int[] arr1,int[] arr2,int[] arr3){

        int x=0;
        int y=0;
        int z=0;

        while(x<arr1.length && y<arr2.length && z<arr3.length){
            if(arr1[x]==arr2[y] && arr2[y]==arr3[z]){
                System.out.print(arr1[x]+" ");
                x++;
                y++;
                z++;
            } else if (arr1[x]>arr2[y]) {
                y++;
            } else if (arr2[y]>arr3[z]) {
                z++;
            }else{
                x++;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr1={1,5,10,20,40,80};
        int[] arr2={6,7,20,80,100};
        int[] arr3={3,4,15,20,30,70,80,120};

        returnCommon(arr1,arr2,arr3);

        System.out.println();
        giveCommon(arr1,arr2,arr3);
    }
}
