package DynamicProgrammingLeetCodeSeries;
//Time Complexity - O(nlgn)
//Space Complexity - O(n)


import java.util.Arrays;

public class LeetCode354RussianDollEnvelope {

    public static void main(String[] args) {
        LeetCode354RussianDollEnvelope leetCode354RussianDollEnvelope = new LeetCode354RussianDollEnvelope();
        int[][] envelope = {{2,4},{5,4},{6,4},{6,5}};
        leetCode354RussianDollEnvelope.maxEnvelopes(envelope);

    }

    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b) -> (a[0] == b[0]) ? (b[1] - a[1]) : (a[0] - b[0]));

        int[] heights = new int[envelopes.length];

        int maxHeight = 0;

        for (int[] env : envelopes) {
            int cur = env[1];
            int index = Arrays.binarySearch(heights, 0, maxHeight, cur);
            if (index < 0) {
                index = -index - 1;         // for not found, binarySearch returns (-index-1)
            }
            if (maxHeight == index)
                maxHeight += 1;
            heights[index] = cur;            // maintain top of card
        }
        return maxHeight;
    }
}
