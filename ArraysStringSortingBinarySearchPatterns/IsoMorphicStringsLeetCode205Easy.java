package ArraysStringSortingBinarySearchPatterns;

import java.util.Arrays;
import java.util.HashMap;

public class IsoMorphicStringsLeetCode205Easy {
    public static void main(String[] args) {
        String s = "foo";
        String t = "baa";
        boolean findWhetherStringIsIsomorphic = isIsomorphic(s,t);
        System.out.println(findWhetherStringIsIsomorphic);

    }

    public static boolean isIsomorphic(String s, String t) {

        //Solutiuon 1

//        if(s == null || s.length() <= 1) return true;
//        HashMap<Character, Character> map = new HashMap<Character, Character>();
//        for(int i = 0 ; i< s.length(); i++){
//            char a = s.charAt(i);
//            char b = t.charAt(i);
//            if(map.containsKey(a)){
//                if(map.get(a).equals(b))
//                    continue;
//                else
//                    return false;
//            }else{
//                if(!map.containsValue(b))
//                    map.put(a,b);
//                else return false;
//
//            }
//        }
//        return true;

        //Solution 2
//        int[] m = new int[512];
//        for (int i = 0; i < s.length(); i++) {
//            if (m[s.charAt(i)] != m[t.charAt(i)+256]) return false;
//            m[s.charAt(i)] = m[t.charAt(i)+256] = i+1;
//        }
//        return true;

        //Solution 3
//        if(s.length() != t.length())
//            return false;
//        // Create two maps for s & t strings...
//        int[] map1 = new int[256];
//        int[] map2 = new int[256];
//        // Traverse all elements through the loop...
//        for(int idx = 0; idx < s.length(); idx++){
//            // Compare the maps, if not equal, return false...
//            if(map1[s.charAt(idx)] != map2[t.charAt(idx)])
//                return false;
//            // Insert each character if string s and t into seperate map...
//            map1[s.charAt(idx)] = idx + 1;
//            map2[t.charAt(idx)] = idx + 1;
//        }
//        return true;    // Otherwise return true...

        //Solution4

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        int length = s1.length;
        if(length != t1.length) return false;

        char[] sm = new char[256];
        char[] tm = new char[256];

        for(int i=0; i<length; i++){
            char sc = s1[i];
            char tc = t1[i];
            if(sm[sc] == 0 && tm[tc] == 0){
                sm[sc] = tc;
                tm[tc] = sc;
            }else{
                if(sm[sc] != tc || tm[tc] != sc){
                    return false;
                }
            }
        }
        return true;
    }

}
