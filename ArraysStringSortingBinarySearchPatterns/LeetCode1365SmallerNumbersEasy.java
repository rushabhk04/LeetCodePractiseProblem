package ArraysStringSortingBinarySearchPatterns;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode1365SmallerNumbersEasy {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
//        int[] outputResult = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            int count = 0;
//            for (int j = 0; j < nums.length; j++) {
//                if (j != i && nums[j] < nums[i]) {
//                    count += 1;
//                }
//            }
//            outputResult[i] = count;
//
//        }
//        return outputResult;


        Map<Integer,Integer> map = new HashMap<>();
        int[] copy = nums.clone();

        Arrays.sort(copy);

        for(int i =0; i<nums.length; i++){
            map.putIfAbsent(copy[i],i);
        }
        for(int i =0; i<nums.length; i++){
            copy[i] = map.get(nums[i]);
        }
        return copy;
    }
}
