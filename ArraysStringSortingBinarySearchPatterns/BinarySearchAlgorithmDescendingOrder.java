package ArraysStringSortingBinarySearchPatterns;

public class BinarySearchAlgorithmDescendingOrder {

    public static void main(String[] args) {
        int[] nums = {24,22,20,15,10,0,-1,-4,-8};
        int target =-4;
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
                end = middle - 1;
            }
            if(nums[middle]>target){
                start=middle+1;
            }
        }
        return -1;
    }

}
