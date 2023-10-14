import java.util.Arrays;

public class ConcatenationOfArrayLeetCode1929 {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(performConcatenation(nums)));

    }

    public static int[] performConcatenation(int[] nums){
//        int[] ans = new int[2*nums.length];
//        for(int i = 0; i<nums.length;i++){
//            ans[i] = nums[i];
//            ans[i+nums.length] = nums[i];
//        }
//        return ans;

        int[] res = new int[nums.length*2];

        for(int i = 0;i<nums.length*2;i++){
            res[i] = nums[i%nums.length];
        }

        return res;
    }
}
