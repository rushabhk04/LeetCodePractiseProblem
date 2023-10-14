public class CountNoOfevenDigits1295 {
    public static void main(String[] args) {
        int[] nums = {12,345,22,66,789787};
        int count = ifEven(nums);
        System.out.println(count);
    }

    public static int ifEven(int[] nums){
        int count = 0;
        for(int digits: nums)
            if(evenCheck(digits)){
                count++;
            }
            return count;
    }
    public  static boolean evenCheck(int nums){
            int digitCount = countNoOfEvenDigits(nums);
            if(digitCount%2==0){
                return true;
            }
        return false;
    }

    static int countNoOfEvenDigits(int nums) {
        int count = 0;
            while(nums>0){
                count++;
                nums = nums/10;
            }
        return count;
    }
}
