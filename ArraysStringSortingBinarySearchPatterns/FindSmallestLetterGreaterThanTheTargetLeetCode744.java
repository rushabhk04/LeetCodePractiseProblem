package ArraysStringSortingBinarySearchPatterns;

public class FindSmallestLetterGreaterThanTheTargetLeetCode744 {
    public static void main(String[] args) {
        char[] letters = {'c','f','g','h','j'};
        char target = 'g';
        char targetChar = nextGreatestLetter(letters,target);
        System.out.println(targetChar);

    }
    public static char nextGreatestLetter(char[] letters, char target) {
                char result = letters[0];
                int start = 0;
                int end = letters.length-1;
                while(start<=end){
                    int middle= start+(end-start)/2;
                    if(target>letters[letters.length-1]){
                        return letters[0];
                    }
                    if(letters[middle]==target){
                        start = middle+1;
                    }
                    if(letters[middle]>target){
                        result = letters[middle];
                        end = middle-1;
                    }
                    if(letters[middle]<target){
                        start= middle+1;
                    }
                }
                return result;
            }
}
