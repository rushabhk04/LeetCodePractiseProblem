import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        cyclicSort(nums);
        System.out.println(Arrays.toString(nums));
    }

//    class Solution {
//    public int missingNumber(int[] nums) {
//        List<Integer> numList = Arrays.stream(nums)
//                                        .boxed()
//                                            .collect(Collectors.toList());
//        int size = nums.length;
//        for(int i =0;i<=size;i++){
//            if(!numList.contains(i))
//                return i;
//        }
//        return 0;
//    }
//}

    public static void cyclicSort(int[] array){
        int i = 0;
        while(i < array.length){
            int correct = array[i]-1;
            if(array[i] != array[correct]){
                swap(array,i,correct);
            }
            else{
                i++;
            }
        }
    }

    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
