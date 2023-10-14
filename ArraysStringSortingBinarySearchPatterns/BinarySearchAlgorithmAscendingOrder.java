package ArraysStringSortingBinarySearchPatterns;

public class BinarySearchAlgorithmAscendingOrder {
    public static void main(String[] args) {
        int[] nums = {-8,-1,0,2,4,6,8,10,12,16,24};
        int target =14;
        int comparisonsForSearching = binarySearch(nums, target);
        System.out.println(comparisonsForSearching);
    }
    static int binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while(start<=end) {
            int middle = start + (end - start) / 2;
            if (nums[middle] == target) {
                return middle;
            }
            if (nums[middle] < target) {
                start = middle + 1;
            }
            if(nums[middle]>target){
                end = middle-1;
            }
        }
        return -1;
    }
}
