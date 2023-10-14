package ArraysStringSortingBinarySearchPatterns;

import java.util.Arrays;

public class BuildArrayFromPermutationLeetCode1920 {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));

    }

    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n ; i++){
            nums[i] = nums[i]+n*(nums[nums[i]]%n);
        }
        for (int i = 0; i <n ; i++){
            nums[i] = nums[i]/n;
        }
        return nums;
    }

    // int[] ans = new int[nums.length];
    // for(int i = 0;i<nums.length;i++){
    //     ans[i] = nums[nums[i]];
    // }
    // return ans;
//Lets first see generally what should be done.
//
//1. We need to store 2 values in one place, so we will use math (quotient and remainder)
//
//2. Let, size of array = n
//original number = a
//final number = b
//
//3. So we will store a = a + n*b
//
//4. On taking a%n, we will get a
//On doing a/n, we will get b
//
//5. Here the b that we are using is actually an a and there is a chance that it might be an a that is updated (final number)
//To get a from a, we use a%n
//So, here it will be b%n
//
//6. Finally, our equation becomes a=a +n(b%n)
//
//7. In the question a=nums[i] and b=nums[nums[i]]
//
//8. So finally, the equation becomes
//nums[i] = nums[i] + n * (nums[nums[i]]%n)

}
