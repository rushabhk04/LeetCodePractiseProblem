//package Top145Interviews;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class Leetcode350Intersection {
//    public static void main(String[] args) {
//        Leetcode350Intersection leetcode350Intersection = new Leetcode350Intersection();
//    }
//    class Solution {
//        public int[] intersect(int[] nums1, int[] nums2) {
//            int nums1length = nums1.length;
//            int nums2length = nums2.length;
//            List<Integer> nums1List = Arrays.asList(nums1);
//            List<Integer> nums2List = Arrays.asList(nums2);
//
//            if(nums2List.size()<nums1List.size()){
//                for(int i =0; i<nums2List.size();i++){
//                    if(nums1List.contains(nums2List.get(i))){
//                        return nums2List.stream().mapToInt(Integer::valueOf).toArray();
//                    }
//                }
//            }
//            else{
//                for(int j =0; j<nums1List.length;j++){
//                    if(nums2List.contains(nums1List.get(j))){
//                        return nums1List.stream().mapToInt(Integer::valueOf).toArray();
//                    }
//                }
//            }
//        }
//    }
//    }
