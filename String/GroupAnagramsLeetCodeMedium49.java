package String;

import java.util.*;

public class GroupAnagramsLeetCodeMedium49 {
    public static void main(String[] args) {
        String[] words = new String[]{"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(words));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            System.out.println(Arrays.toString(chars));
            String key = String.valueOf(chars);

            if (!hm.containsKey(key)) {
                hm.put(key, new ArrayList<>());
            }
            hm.get(key).add(s);

        }
        return new ArrayList<>(hm.values());
    }
}
