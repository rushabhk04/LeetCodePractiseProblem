package DynamicProgrammingLeetCodeSeries;

//Time Complexity - O(n)
//Space Complexity- O(n)
public class MaximumSubArrayLeetCode53 {
    public static void main(String[] args) {
        int[] nums = {1, -2, 3, -2};
        MaximumSubArrayLeetCode53 maximumSubArrayLeetCode53 = new MaximumSubArrayLeetCode53();
        System.out.println(maximumSubArrayLeetCode53.maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {
        int meh = 0;
        int msf = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            meh += nums[i];
            if (meh < nums[i]) {
                meh = nums[i];
            }
            if (msf < meh) {
                msf = meh;
            }
        }
        return msf;
    }
}
