import java.util.Arrays;

public class RunningSumOfArrayLeetCodeEasy1480 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(findSum(nums)));
        //Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
        //
        //Return the running sum of nums.
        //
        //
        //
        //Example 1:
        //
        //Input: nums = [1,2,3,4]
        //Output: [1,3,6,10]
        //Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
    }

    public static int[] findSum(int[] nums){
//        int i = 0;
//        int sum = 0;
//        for(Integer a: nums){
//            sum +=a;
//            nums[i] = sum;
//            i++;
//        }
//        return nums;

        for(int i = 1; i<nums.length;i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
}
