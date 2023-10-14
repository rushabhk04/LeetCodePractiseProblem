package Array;

import java.util.Arrays;
import java.util.HashMap;

public class MinNoOfTapsToCoverGradenLeetcode1362 {
    public static void main(String[] args) {
        int n = 5;
        int[] ranges = new int[]{3,4,1,1,0,0};
        MinNoOfTapsToCoverGradenLeetcode1362 minNoOfTapsToCoverGradenLeetcode1362 = new MinNoOfTapsToCoverGradenLeetcode1362();
        minNoOfTapsToCoverGradenLeetcode1362.minTaps(n,ranges);
    }
    public void minTaps(int n, int[] ranges) {
        int gardenLength = n;
        int noOfTaps = n+1;
        HashMap<Integer,int[]> map = new HashMap<>();
        for(int i =0; i<ranges.length;i++){
            int[] rangeOfGardenCoveredByTap = new int[2];
            int firstRange = i-ranges[i];
            int secondRange = i+ ranges[i] ;
            rangeOfGardenCoveredByTap[0] = firstRange;
            rangeOfGardenCoveredByTap[1] = secondRange;
            map.put(i,rangeOfGardenCoveredByTap);
        }

    }
}
