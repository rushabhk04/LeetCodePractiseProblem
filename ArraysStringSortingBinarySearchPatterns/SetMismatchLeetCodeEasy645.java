package ArraysStringSortingBinarySearchPatterns;

import java.util.Arrays;

public class SetMismatchLeetCodeEasy645 {

    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int index= nums[i]-1;
            if(nums[index] != nums[i]){
                swap(nums,i,index);
            }
            else{
                i++;
            }
        }
        for(int iterating = 0; iterating<nums.length; iterating++){
            if(nums[iterating]!=iterating+1){
                return new int[]{nums[iterating],iterating+1};
            }
        }
        return new int[]{-1,-1};
    }

    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
//Time Complexity
//class Solution {
//    public int[] findErrorNums(int[] nums) {
//        int freq[] = new int[nums.length+1];
//        for (int i:nums) freq[i]++;
//        int dup = 0, miss = 0;
//        for (int i = 1; i < freq.length; i++) {
//            if (freq[i]==2) dup = i;
//            if (freq[i]==0) miss = i;
//            if (dup!=0 && miss!=0) break;
//        }
//        return new int[]{dup,miss};
//    }
//}


//Space Complexity
//class Solution {
//    public int[] findErrorNums(int[] nums) {
//        int i=0;
//        int n[]= new int[2];
//        while(i<nums.length){
//            if(nums[i]!=nums[nums[i]-1]){
//                int temp=nums[nums[i]-1];
//                nums[nums[i]-1]=nums[i];
//                nums[i]=temp;
//
//                }
//            else i++;
//        }
//        // for(i=0;i<nums.length;i++){
//        //     if(nums[i]!=(i+1)){
//        //         n[0]=nums[i];
//        //         if(nums[i]==nums[0]){
//        //             n[1]=nums[i]+1;
//        //             break;
//        //         }
//        //         else if(nums[i]==nums[nums.length-1]){
//        //             n[1]=nums[i]-1;
//        //             break;
//        //         }
//        //         else{
//        //             n[1]=nums[i]+1;
//        //         }
//        //     }
//        // }
//        for(i=0;i<nums.length;i++){
//            if(nums[i]!=(i+1)){
//                n[0]=nums[i];
//                n[1]=i+1;}
//        }
//        return n;
//    }
//}
