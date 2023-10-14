package ArraysStringSortingBinarySearchPatterns;

public class ValidMountainArrayLeetCode941 {
    public static void main(String[] args) {
        int[] array = {3,2,1};
        System.out.println(ifArrayIsMountainArrayOrNot(array));
    }

    private static boolean ifArrayIsMountainArrayOrNot(int[] array) {
        if(array.length<3){
            return false;
        }
        else{
            int leftPointerFromStart=0;
            int endPointerFromEnd = array.length-1;
            while (leftPointerFromStart+1<array.length-1 && array[leftPointerFromStart]<array[leftPointerFromStart+1]) {
                leftPointerFromStart++;
                while (endPointerFromEnd - 1> 0 && array[endPointerFromEnd] < array[endPointerFromEnd - 1]) {
                    endPointerFromEnd--;
                }
            }
            return leftPointerFromStart==endPointerFromEnd;

        }
//        if(array.length>=3){
//            int start= 0 ;
//            int end = array.length-1;
//            while(start<=end){
//                int middle = start+(end-start)/2;
//                if(array[middle]>array[middle+1] && array[middle-1]<array[middle]){
//                    end=middle-1;
//                    return true;
//                }
//                else{
//                    start=middle+1;
//                    return false;
//                }
//            }
//            return false;
//        }
//        else{
//            return false;
//        }

    }
}
