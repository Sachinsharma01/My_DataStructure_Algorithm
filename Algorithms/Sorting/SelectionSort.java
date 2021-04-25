package Algorithms.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public int[] sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min])
                    min = j;
            }
            if (min != i) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        return array;
    }
}

class Main {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {1, 6, 8, 2, 8, 96, 5, 89};
        System.out.println(Arrays.toString(selectionSort.sort(arr)));
    }
}