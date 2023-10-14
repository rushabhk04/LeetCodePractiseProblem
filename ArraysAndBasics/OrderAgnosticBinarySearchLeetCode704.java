public class OrderAgnosticBinarySearchLeetCode704 {
    public static void main(String[] args) {
        int[] nums = {32,24,2,0,-1};
        int target =2;
        int comparisonsForSearching = binarySearch(nums, target);
        System.out.println(comparisonsForSearching);
    }

    //time complexity = O(logn)
    //Space complexity = O(1)
    //   public int search(int[] nums, int target) {
    //        int l = 0;
    //        int r = nums.length - 1;
    //
    //        int mid = (l + r) / 2;
    //
    //        while (nums[mid] != target){
    //            if (l == r){
    //                return -1;
    //            }
    //            if (target < nums[mid]){
    //                r = mid;
    //            }
    //            else{
    //                l = mid+1;
    //            }
    //            mid = (l + r) / 2;
    //        }
    //        return mid;
    //    }
    static int binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        boolean isAscending = false;
        if(nums[start]<nums[end]){
             isAscending = true;
        }
        while(start<=end) {
            int middle = start + (end - start) / 2;
            if (nums[middle] == target) {
                return middle;
            }
            if(isAscending) {
                if (nums[middle] < target) {
                    start = middle + 1;
                }
                if (nums[middle] > target) {
                    end = middle - 1;
                }
            }else{
                if (nums[middle] < target) {
                    end = middle - 1;
                }
                if(nums[middle]>target){
                    start=middle+1;
                }
            }
        }
        return -1;
    }
}
