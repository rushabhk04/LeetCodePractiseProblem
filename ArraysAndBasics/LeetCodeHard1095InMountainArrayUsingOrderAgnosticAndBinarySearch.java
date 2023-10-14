///**
// * // This is MountainArray's API interface.
// * // You should not implement it, or speculate about its implementation
// * interface MountainArray {
// *     public int get(int index) {}
// *     public int length() {}
// * }
// */
//
class LeetCodeHard1095InMountainArrayUsingOrderAgnosticAndBinarySearch {
    public static void main(String[] args) {

    }
}
//
//    public int findInMountainArray(int target, MountainArray mountainArr) {
//        int peak = findPeakOfElements(mountainArr);
//        int targetFound = binarySearch(target,mountainArr,0,peak);
//        if(targetFound!=-1){
//            return targetFound;
//        }
//        else{
//            return binarySearch(target,mountainArr,peak+1,mountainArr.length()-1);
//        }
//    }
//
//    public int binarySearch(int target, MountainArray mountainArr,int start, int end){
//        boolean isAscending = false;
//        if(mountainArr.get(start)< mountainArr.get(end)){
//            isAscending = true;
//        }
//        while(start<=end) {
//            int middle = start + (end - start) / 2;
//            if (mountainArr.get(middle)== target) {
//                return middle;
//            }
//            if(isAscending) {
//                if (mountainArr.get(middle) < target) {
//                    start = middle + 1;
//                }
//                else{
//                    end= middle-1;
//                }
//            }else{
//                if (mountainArr.get(middle) > target) {
//                    start = middle+1;
//
//                }
//                else{
//                    end = middle - 1;
//                }
//            }
//        }
//        return -1;
//    }
//
//    public static int findPeakOfElements(MountainArray mountainArr){
//        int beginning = 0;
//        int ending = mountainArr.length()-1;
//        while(beginning<ending){
//            int middle = beginning + (ending-beginning)/2;
//            if(mountainArr.get(middle)>mountainArr.get(middle+1)){
//                ending = middle;
//            }
//            else{
//                beginning = middle+1;
//            }
//        }
//        return beginning;
//    }
//}