package ArraysStringSortingBinarySearchPatterns;

import java.util.*;

public class MinimumCommonValueLeetCodeContest {
    //6300. Minimum Common Value
    //User Accepted:6848
    //User Tried:8067
    //Total Accepted:6979
    //Total Submissions:10954
    //Difficulty:Easy
    //Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. If there is no common integer amongst nums1 and nums2, return -1.
    //
    //Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.
    //
    //
    //
    //Example 1:
    //
    //Input: nums1 = [1,2,3], nums2 = [2,4]
    //Output: 2
    //Explanation: The smallest element common to both arrays is 2, so we return 2.
    //Example 2:
    //
    //Input: nums1 = [1,2,3,6], nums2 = [2,3,4,5]
    //Output: 2
    //Explanation: There are two common elements in the array 2 and 3 out of which 2 is the smallest, so 2 is returned.
    //
    //
    //Constraints:
    //
    //1 <= nums1.length, nums2.length <= 105
    //1 <= nums1[i], nums2[j] <= 109
    //Both nums1 and nums2 are sorted in non-decreasing order.
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,6,7,8,9};
        int[] nums2 = {3,4,5,6,7,8};
        int result = findMinimumCommonValue(nums1,nums2);
        System.out.println(result);
    }

    private static int findMinimumCommonValue(int[] nums1, int[] nums2) {
//        List<Integer> finalResult = new ArrayList<>();
//        for (int k : nums1) {
//            for (int i : nums2) {
//                if (k == i) {
//                    finalResult.add(k);
//                }
//            }
//        }
//        System.out.println(finalResult);
//        Collections.sort(finalResult);
//        return finalResult.get(0);


        // HashSet<Integer> hashSet1 = new HashSet<>();
        //        for(int i: nums1){
        //            hashSet1.add(i);
        //        }
        //        HashSet<Integer> hashSet2 = new HashSet<>();
        //        for(int i: nums2){
        //            hashSet2.add(i);
        //        }
        //        hashSet1.retainAll(hashSet2);
        //         int[] finalResult = new int[hashSet1.size()];
        //         int index = 0;
        //         for(int elementsOfSet: hashSet1){
        //             finalResult[index++]=elementsOfSet;
        //         }
        //         Arrays.sort(finalResult);
        //         return finalResult[0];

        int min , i =0, j= 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                return nums1[i];
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }

        return -1;
    }
}
