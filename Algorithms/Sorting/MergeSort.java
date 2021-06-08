package Algorithms.Sorting;

/* Merge Sort is one of the most popular sorting algo based on divide and conquer algorithm
*  TODO:: visit link for more => https://youtu.be/e2f942HFh6k
*  Complexity => O(nlog(n)) */

public class MergeSort {
    static void merge(int[] array, int left, int middle, int right) {
        int[] leftArray = new int[middle - left + 2];
        int[] rightArray = new int[middle - right + 2];
        for (int i = 0; i <= middle - left; i++) {
            leftArray[i] = array[left + i];
        }
        for (int i = 0; i <= middle - right; i++) {
            rightArray[i] = array[left + i];
        }
        leftArray[middle - left + 2] = Integer.MAX_VALUE;
        rightArray[middle - right + 2] = Integer.MAX_VALUE;
        int i = 0, j = 0;
        for (int k = left; k <= right; k++) {
            if (leftArray[i] < rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[i];
                j++;
            }
        }
    }
    public static void mergeSort(int[] array, int left, int right) {
        if (right > left) {
            int a = (left + right) / 2;
            mergeSort(array, left, a);
            mergeSort(array, a+1, right);
            merge(array, left, a, right);
        }
    }
}

class MergeSortMain {
    public static void main(String[] args) {
        int[] array = {1, 2, 6, 89, 4, 6, 8, 4, 5, 87, 544, 54};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(array, 0, array.length - 1);
    }
}
