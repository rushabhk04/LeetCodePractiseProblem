package DynamicProgrammingLeetCodeSeries;

public class LeetCode2369ValidPartitionOfArrays {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 4};
        LeetCode2369ValidPartitionOfArrays leetcode2369ValidPartitionOfArrays = new LeetCode2369ValidPartitionOfArrays();
        System.out.println(leetcode2369ValidPartitionOfArrays.validPartition(nums));
    }

    public boolean validPartition(int[] nums) {
        int numsLength = nums.length;
        if (numsLength == 1) {
            return false;
        }
        boolean[] dp = new boolean[]{true, false, numsLength > 1 && nums[0] == nums[1]};

        for (int i = 2; i < numsLength; i++) {
            boolean currentDp = false;

            if (nums[i] == nums[i - 1] && dp[1]) {
                currentDp = true;
            } else if (nums[i] == nums[i - 1] && nums[i - 1] == nums[i - 2] && dp[0]) {
                currentDp = true;
            } else if (nums[i] - nums[i - 1] == 1 && nums[i - 1] - nums[i - 2] == 1 && dp[0]) {
                currentDp = true;
            }
            dp[0] = dp[1];
            dp[1] = dp[2];
            dp[2] = currentDp;

        }
        return dp[2];
    }

}
