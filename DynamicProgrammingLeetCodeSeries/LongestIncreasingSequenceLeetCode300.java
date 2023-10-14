package DynamicProgrammingLeetCodeSeries;
//Time Complexity - O(nlgn)
//Space Complexity - O(n)
import java.util.TreeSet;

public class LongestIncreasingSequenceLeetCode300 {
    public static void main(String[] args) {
        int[] number = {10,9,2,5,3,7,101,18};
        LongestIncreasingSequenceLeetCode300 longestIncreasingSequenceLeetCode300 = new LongestIncreasingSequenceLeetCode300();
        System.out.println(longestIncreasingSequenceLeetCode300.lengthOfLIS(number));
    }
    public int lengthOfLIS(int[] nums) {
        TreeSet<Integer> tr = new TreeSet<>();
        for (int number : nums) {
            Integer higherOrEqual = tr.ceiling(number);
            if (higherOrEqual == null) {
                tr.add(number);

            } else {
                tr.remove(higherOrEqual);
                tr.add(number);
            }
        }
        return tr.size();
    }
}
