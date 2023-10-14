import java.util.Arrays;

public class SearchInMatrixOf2DArrays {
    public static void main(String[] args) {
        int[][] nums = {
                {10,20,30,40},
                {11,25,96,45},
                {28,29,36,49},
                {33,34,38,50}
        };
        int target = 96;
        System.out.println(Arrays.toString(searchInArray(nums,target)));

    }
    public static int[] searchInArray(int[][] nums, int target){
        int row = 0;
        int column = nums.length-1;

        while(row<nums.length && column>=0){
            if(nums[row][column]==target){
                return new int[]{row,column};
            }
            if(nums[row][column]<target){
                row++;
            }
            else{
                column--;
            }

        }
        return new int[]{-1,-1};
    }

}
