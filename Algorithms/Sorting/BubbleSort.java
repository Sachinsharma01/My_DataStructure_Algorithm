package Algorithms.Sorting;

/* Bubble Sort is the technique to sort the data
*  Complexity => O(n^2)
*  Replace array[j] > array[j + 1] <=> array[j] < array[j + 1] to sort in descending order
*  TODO:: visit this link for more => https://www.youtube.com/watch?v=v6hmmfIiKu4 */

import java.util.Arrays;

public class BubbleSort {
    public int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}

class BubbleSortMain {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {1, 65, 8, 6, 89, 3, 9, 86, 9, 85};
        System.out.println(Arrays.toString(bubbleSort.bubbleSort(arr)));
    }
}
