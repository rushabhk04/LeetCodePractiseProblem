package ArraysStringSortingBinarySearchPatterns;

public class SplitLargestArraySum {
    public static void main(String[] args) {
        int[] nums = {7,2,5,8,10};
        int noOfSplit = 2;
        System.out.println(splitArray(nums,noOfSplit));
    }
    public static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for(int i = 0; i < nums.length;i++){
            start = Math.max(start,nums[i]);
            end+=nums[i];
        }
        while (start<end){
            int middle = start+(end-start)/2;
            int sum=0;
            int pieces = 1;
            for(int num:nums) {
                if (sum + num > middle) {
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

                if(pieces>k){
                    start = middle +1;
                }
                else{
                    end = middle;
                }
        }
        return start;
    }
}
