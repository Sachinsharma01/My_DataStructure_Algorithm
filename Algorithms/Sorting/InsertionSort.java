package Algorithms.Sorting;
/* TODO :: visit the link for more details => https://youtu.be/f-f50FjS_jA */

import java.util.Arrays;

public class InsertionSort {
    public int[] insertionSort(int[] array) {
        int temp, j;
        for (int i = 0; i < array.length; i++) {
            temp = array[i];
            j = i;
            while (j > 0 && array[j - 1] > temp) {
                array[j] = array[j - 1];
                j = j - 1;
            }
            array[j] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        System.out.println(Arrays.toString(insertionSort.insertionSort(new int[]{2, 8, 1, 3, 6, 7, 5, 4})));
    }
}
