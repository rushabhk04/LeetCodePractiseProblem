public class FindElementIntInArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        int index = findIndex(arr, 5);
        System.out.println(index);
    }
    // Sorted then use binary search tree.
    //requirement - I thought it's increasing by 1 and every value is present.
    //index of an element in array
    //hint - sorted array
    //Approach-in array , loop through it , check if element is there or not , if yes find index
    //find starting point , then add to reach the desired value, check its index
    //Edge-length of array not null, 
    //
    //TimeComplexity- O(n) if binary search tree - O(logn)
    //
    //SpaceComplexity- O(n)
    public static int findIndex(int[] arr, int element) {
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==element) {
                return i;
            }
        }
        return -1;
    }
    
}
