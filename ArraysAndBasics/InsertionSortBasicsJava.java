import java.util.Arrays;

public class InsertionSortBasicsJava {
    public static void main(String[] args) {
        int[] nums = {1,4,5,2,0};
        insertionSortUsingForLoops(nums);
        //int[] finalSortedArray = insertionSort(nums);

        System.out.println(Arrays.toString(nums));

    }

    private static int[] insertionSort(int[] nums) {
        int i = 0;
        while (i <= nums.length - 2) {
            int j = 1;
            while (j < nums.length && j>j-1) {
                if (nums[j-1] > nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    j--;
                }
                j++;
            }
            i++;
        }
        return nums;
    }

    public static void insertionSortUsingForLoops(int[] nums){
        for(int i = 0; i< nums.length-1;i++){
            for(int j = i+1; j>0;j--){
                if(nums[j]<nums[j-1]){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
                else{
                    break;
                }
            }
        }
    }


}
