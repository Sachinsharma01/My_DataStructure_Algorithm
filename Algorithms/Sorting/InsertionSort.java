package Algorithms.Sorting;
/* TODO :: visit the link for more details => https://youtu.be/f-f50FjS_jA */

public class InsertionSort {
    public void sort(int[] array) {
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
    }
}
