public class FindTheDuplicateNumberLeetCode287 {

    public static void main(String[] args) {
    int[] nums = {1,3,4,2,2};
    System.out.println(findDuplicate(nums));
    }


    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int index = nums[i] - 1;
            if (nums[index] != nums[i]) {
                swap(nums, i, index);
            } else {
                i++;
            }
        }

        for (int interating = 0; interating < nums.length; interating++) {
            if (nums[interating] != interating + 1) {
                return nums[interating];
            }
        }

        return -1;
    }

    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

