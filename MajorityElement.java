//Give an Integer array of size n, find all element that appears more the [n/3} times
//nums[]={1,3,2,5,1,3,1,5,1} ==> 1
//nums[]={1,2} ==> 1,2

import java.util.ArrayList;
import java.util.HashMap;

public class MajorityElement {
//    public static void majorityElement(int[] nums){
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int n = nums.length;
//        for(int i=0;i<n;i++){
//            if(map.containsKey(nums[i])){
//                map.put(nums[i], map.get(nums[i])+1);
//            }else{
//                map.put(nums[i],1);
//            }
//        }
//        for(int key: map.keySet()){
//            if(map.get(key) > n/3){
//                System.out.println(key);
//            }
//        }
//    }

    public static void majorityElement(int[] nums){
        HashMap<Integer, Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)>n/3){
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) {
//        int[] nums={1,3,2,5,1,3,1,5,1};
        int[] nums={1,2};
        majorityElement(nums);

    }
}
