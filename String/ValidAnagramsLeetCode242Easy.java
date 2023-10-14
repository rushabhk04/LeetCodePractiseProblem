package String;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagramsLeetCode242Easy {
    public static void main(String[] args) {
        ValidAnagramsLeetCode242Easy validAnagramsLeetCode242Easy = new ValidAnagramsLeetCode242Easy();
        System.out.println(validAnagramsLeetCode242Easy.isAnagram("ana","naa"));
    }


        public boolean isAnagram(String s, String t) {
//            char[] charofS = s.toCharArray();
//            char[] charofT = t.toCharArray();
//            HashMap<Character, Integer> hmp = new HashMap<>();
//            HashMap<Character, Integer> hmp1 = new HashMap<>();
//            int countForS = 1;
//            int countForT = 1;
//            for (char charof : charofS) {
//                if (hmp.containsKey(charof)) {
//                    hmp.put(charof, hmp.get(charof) + 1);
//                }
//                else{
//                    hmp.put(charof, countForS);
//                }
//            }
//            for (char c : charofT) {
//                if (hmp1.containsKey(c)) {
//                    hmp1.put(c, hmp1.get(c) + 1);
//                }
//                else{
//                    hmp1.put(c, countForT);
//                }
//            }
//            return hmp.equals(hmp1);

            int alphas[] = new int[26];
            for(char ch : s.toCharArray()){
                alphas[ch-'a']++;
            }
            System.out.println(Arrays.toString(alphas));
            for(char ch : t.toCharArray()){
                alphas[ch-'a']--;
            }
            System.out.println(Arrays.toString(alphas));
            for(int i : alphas){
                if(i != 0){
                    return false;
                }
            }
            return true;
        }
}
