import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class LeetCode1773CountItemsMatchingARule {
    public static void main(String[] args) {
        List<List<String>> lists = asList(asList("phone","blue","pixel"),asList("computer","silver","phone"),asList("phone","gold","iphone"));
        String ruleKey = "type";
        String ruleValue = "phone";
        LeetCode1773CountItemsMatchingARule leetCode1773CountItemsMatchingARule = new LeetCode1773CountItemsMatchingARule();
        int count = leetCode1773CountItemsMatchingARule.countMatches(lists,ruleKey,ruleValue);
        System.out.println(count);
    }

        public int countMatches (List < List < String >> items, String ruleKey, String ruleValue){
            int count = 0;

            for(int i = 0 ;i<items.size();i++){
                if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) count++;
                if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) count++;
                if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) count++;
            }

            return count;
        }
}
