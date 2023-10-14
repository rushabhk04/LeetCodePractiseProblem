package ArraysStringSortingBinarySearchPatterns;

import java.util.Arrays;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12},
        };
        int target = 8;
        System.out.println(Arrays.toString(search(matrix,target)));
    }

    public static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int columns = matrix[0].length;

        if(columns==0){
            return new int[]{-1,-1};
        }

        if(rows ==1){
            return binarySearch(matrix, 0,0,columns-1,target);
        }

        int rowStart = 0;
        int rowEnd = rows-1;
        int columnsMiddle = columns/2;

        while(rowStart<=(rowEnd-1)){
            int rowMiddle = rowStart + (rowEnd-rowStart)/2;
            if(matrix[rowMiddle][columnsMiddle]==target){
                return new int[]{rowMiddle,columnsMiddle};
            }
            if(matrix[rowMiddle][columnsMiddle]<target){
                rowStart = rowMiddle;

            }
            else{
                rowEnd = rowMiddle;
            }
        }
        if(matrix[rowStart][columnsMiddle]== target){
            return new int[]{rowStart,columnsMiddle};
        }
        if(matrix[rowStart+1][columnsMiddle]== target){
            return new int[]{rowStart+1,columnsMiddle};
        }

        if(target <= matrix[rowStart][columnsMiddle-1]){
            return binarySearch(matrix,rowStart,0,columnsMiddle-1,target);
        }
        if(target >= matrix[rowStart][columnsMiddle+1] && target<=matrix[rowStart][columns-1]){
            return binarySearch(matrix,rowStart,columnsMiddle+1,columns-1,target);
        }
        if(target<=matrix[rowStart+1][columnsMiddle-1]){
            return binarySearch(matrix,rowStart+1,0,columnsMiddle-1,target);
        }
        else{
            return binarySearch(matrix,rowStart+1,columnsMiddle+1,columns-1,target);
        }
    }

    private static int[] binarySearch(int[][] matrix, int rows, int columnsStart, int columnsEnd, int target) {
        while(columnsStart<=columnsEnd){
            int middle= columnsStart+(columnsEnd-columnsStart)/2;
            if(matrix[rows][middle]==target){
                return new int[]{rows,middle};
            }
            if(matrix[rows][middle] < target){
                columnsStart = middle+1;
            }
            else {
                columnsEnd = middle-1;
            }
        }
        return new int[]{-1,-1};
    }
}
