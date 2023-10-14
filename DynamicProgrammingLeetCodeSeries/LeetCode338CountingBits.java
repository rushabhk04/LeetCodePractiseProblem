package DynamicProgrammingLeetCodeSeries;

import java.util.Arrays;

public class LeetCode338CountingBits {
        public int[] countBits(int n) {
//            int[] finalArray = new int[n+1];
//            for(int i =0;i <= n ;i++){
//                String binaryString = Integer.toBinaryString(i);
//                finalArray[i] = countNoOfBitsInBinary(binaryString);
//            }
//            return finalArray;

            int[] result = new int[n + 1];
            count(result, 1, 1, n + 1);
            return result;
        }
            private void count(int[] result, int count, int i, int n) {
                if (i >= n) return;
                result[i] = count;
                count(result, count, i*2, n);
                count(result, count+1, i*2 + 1, n);
            }

        public int countNoOfBitsInBinary(String s){
            int length = s.length();
            int count = 0;
            for(int i =0; i < length; i++){
                if(s.charAt(i)=='1'){
                    count+=1;
                }
            }
            return count;
        }

    public static void main(String[] args) {
        LeetCode338CountingBits leetCode338CountingBits = new LeetCode338CountingBits();
        System.out.println(Arrays.toString(leetCode338CountingBits.countBits(2)));
    }
}
