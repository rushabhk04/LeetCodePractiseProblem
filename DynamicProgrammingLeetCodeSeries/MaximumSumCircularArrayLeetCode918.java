package DynamicProgrammingLeetCodeSeries;

public class MaximumSumCircularArrayLeetCode918 {
    public static void main(String[] args) {
        int[] nums = {1,2,-3,2};
        MaximumSumCircularArrayLeetCode918 maximumSumCircularArrayLeetCode918 = new MaximumSumCircularArrayLeetCode918();
        System.out.println(maximumSumCircularArrayLeetCode918.maxSubarraySumCircular(nums));

    }

    public static int maxSubarraySumCircular(int[] nums) {

        int max_straight_sum = Integer.MIN_VALUE;
        int min_straight_sum = Integer.MAX_VALUE;
        int temp_max = 0;
        int temp_min = 0;
        int arraySum = 0;

        for (int i = 0; i < nums.length; i++) {
            arraySum += nums[i];

            temp_max += nums[i];
            max_straight_sum = max_straight_sum < temp_max ? temp_max : max_straight_sum;
            temp_max = temp_max < 0 ? 0 : temp_max;

            temp_min += nums[i];
            min_straight_sum = min_straight_sum > temp_min ? temp_min : min_straight_sum;
            temp_min = temp_min > 0 ? 0 : temp_min;


        }
        if (arraySum == min_straight_sum) {
            return max_straight_sum;
        }
        return Math.max(max_straight_sum, (arraySum - min_straight_sum));

    }

}
