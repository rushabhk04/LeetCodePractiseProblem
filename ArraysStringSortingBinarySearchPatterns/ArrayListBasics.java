package ArraysStringSortingBinarySearchPatterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListBasics {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i =0;i<5;i++) {
            list.add(scanner1.nextInt());
            System.out.println(list.get(i));
        }
        System.out.println(list);

        int[] arrayOneD = {1,2,3};
        System.out.println(Arrays.toString(arrayOneD));

        int[][] arr = {
                {1,2,10},
                {3,4},
                {4,5,6}
        };

        arr[0][2] = 9;
        int max = arr[0][0];
        for(int row = 0;row<arr.length;row++){
            for(int column = 0;column<arr[row].length;column++){
                System.out.println(arr[row][column] + "");
                if(arr[row][column]>max){
                    max = arr[row][column];
                }
            }
            System.out.println();
        }
        System.out.println(max);



        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        for(int i = 0; i < 3 ; i++){
            arrayList.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3 ; j++){
                arrayList.get(i).add(scanner.nextInt());
            }
        }
        System.out.println(arrayList);


        int[] arr1 = {2, 3, 4, 5};
        reverseOfArray(arr1);
        System.out.println(Arrays.toString(arr1));
    }
    static void reverseOfArray(int[] fg){
            int start = 0;
            int end = fg.length - 1;
            while (start < end) {
                int temp = fg[start];
                fg[start] = fg[end];
                fg[end] = temp;
                start++;
                end--;
            }
        }
    }
