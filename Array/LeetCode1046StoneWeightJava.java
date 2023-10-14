package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode1046StoneWeightJava {

    public static void main(String[] args) {
    LeetCode1046StoneWeightJava leetCode1046StoneWeightJava = new LeetCode1046StoneWeightJava();
    int[] stones = new int[]{2,2};
    System.out.println(leetCode1046StoneWeightJava.lastStoneWeight(stones));
    }

    public int lastStoneWeight(int[] stones) {
        int remaining = 0;
        List<Integer> stoneList = new ArrayList<>();
        for (int i = 0; i < stones.length; i++) {
            stoneList.add(stones[i]);
        }
        Collections.sort(stoneList, Collections.reverseOrder());

        while (stoneList.size() != 1 && !stoneList.isEmpty()) {
            int first = 0;
            int second = 1;
            int stone1 = stoneList.get(first);
            int stone2 = stoneList.get(second);
            if (stone1 != stone2) {
                stoneList.add(stone1 - stone2);
                stoneList.remove(first);
                stoneList.remove(first);
                Collections.sort(stoneList, Collections.reverseOrder());
            } else {
                stoneList.remove(first);
                stoneList.remove(first);
            }
        }
        if(!stoneList.isEmpty()){
            return stoneList.get(remaining);
        }
        else{
            return 0;
        }
    }
}
