public class findMinArrayUsingLinearSearch {
    public static void main(String[] args) {
        int[] arr = {11,2,3,7,9};
        System.out.println(minArrayUsingLinearSearch(arr));
    }

    //same using range as well,only difference is to change for loop condition
    static int minArrayUsingLinearSearch(int[] arr){
        int min = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
