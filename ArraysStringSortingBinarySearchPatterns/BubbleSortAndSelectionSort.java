package ArraysStringSortingBinarySearchPatterns;

import java.util.Arrays;

public class BubbleSortAndSelectionSort {
    public static void main(String[] args) {
        int[] nums = {-20,0,-45,-54};
        //bubbleSort(nums);
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void bubbleSort(int[] nums){
        boolean isSwapped;
        for(int i = 0; i < nums.length-1;i++){
            isSwapped = false;
            for(int j = 1;j< nums.length-i;j++){
                if(nums[j-1]>nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                     isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
        }

    }

    public static void selectionSort(int[] nums){
        for(int i = 0 ; i < nums.length;i++){
            int last = nums.length-i-1;
            int max = getMax(nums,0,last);
            swap(nums,max,last);
        }
    }

    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    private static int getMax(int[] nums, int start, int last) {
        int max=start;
        for(int i = start; i <= last; i++){
            if(nums[max]<nums[i]){
                max = i;
            }

        }
        return max;
    }


}
