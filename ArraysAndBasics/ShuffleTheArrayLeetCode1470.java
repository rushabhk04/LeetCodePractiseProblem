import java.util.Arrays;

public class ShuffleTheArrayLeetCode1470 {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(doShuffling(nums,n)));

    }

    private static int[] doShuffling(int[] nums,int n) {
        int lengthOfNums = nums.length;
        for(int i = n;i<lengthOfNums;i++){
            nums[i] = (nums[i]*1024) + nums[i-n];
        }
        int index=0;
        for(int i = n;i<lengthOfNums;i++, index+=2){
            nums[index] = nums[i]%1024;
            nums[index+1] = nums[i]/1024;
        }
        return nums;
    }


}
