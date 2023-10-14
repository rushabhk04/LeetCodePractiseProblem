import java.util.Scanner;

public class PositionOfElementInInfiniteSortedArrayLeetCodeAmazonInterview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] nums = {32,128,1024,104875,4294296,348292,293823} ;
        int target=150;
        System.out.println(binarySearchToFindElementsInInfiniteArray(nums,target));
    }

    public static int binarySearchToFindElementsInInfiniteArray(double[] nums,int target){
        int start=0;
        int end=1;
        while(target>nums[end]){
            int newStart=end+1;
            end=end +(end-start+1)*2;
            start = newStart;
        }
        return binarySearchAppliedOnBounds(nums,target,start,end);

    }

    public static int binarySearchAppliedOnBounds(double[] nums, int target, int start, int end) {
        while(start<=end){
            int middle = start+(end-start)/2;
            if(nums[middle]==target){
                return middle;
            }
            if(nums[middle]<target){
                start=middle+1;
            }
            if(nums[middle]>target){
                end=middle-1;
            }
        }
        return -1;
    }

}
