import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1431KidsWithGreatestCandiesEasy {
    public static void main(String[] args) {
    int[] nums = {4,2,1,1,2};
    int extra = 1;
    System.out.println(kidsWithCandies(nums,extra));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> booleans = new ArrayList<>();
        int max=0;
        for(int i = 0; i<candies.length;i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        for(int i = 0; i<candies.length;i++) {
            if (candies[i] + extraCandies >= max) {
                booleans.add(true);
            }
            else{
                booleans.add(false);
            }
        }

        return booleans;
    }
}
