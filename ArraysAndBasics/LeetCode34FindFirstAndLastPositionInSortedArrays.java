import java.util.Arrays;

public class LeetCode34FindFirstAndLastPositionInSortedArrays {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 7;
        int[] finalResult= searchRange(nums,target);
        System.out.println(Arrays.toString(finalResult));
    }
        public static int[] searchRange(int[] nums, int target) {
            int[] finalResult = new int[2];
            finalResult[0] = findFirstDigit(nums, target);
            finalResult[1] = findLastDigit(nums, target);
            return finalResult;
        }

        public static int findFirstDigit(int[] nums, int target) {
            int index = -1;
            int start = 0;
            int end = nums.length - 1;
            while (start <= end) {
                int middle = start + (end - start) / 2;
                if (nums.length == 0 && target == 0) {
                    return index;
                }
                if (nums[middle] == target) {
                    index = middle;
                    end = middle - 1;
                }
                if (nums[middle] > target) {
                    end = middle - 1;
                }
                if (nums[middle] < target) {
                    start = middle + 1;
                }
            }
            return index;
        }

        public static int findLastDigit(int[] nums, int target) {
            int index = -1;
            int start = 0;
            int end = nums.length - 1;
            while (start <= end) {
                int middle = start + (end - start) / 2;
                if (nums.length == 0 && target == 0) {
                    return index;
                }
                if (nums[middle] == target) {
                    index = middle;
                    start = middle + 1;
                }
                if (nums[middle] > target) {
                    end = middle - 1;
                }
                if (nums[middle] < target) {
                    start = middle + 1;
                }
            }
            return index;
        }
}