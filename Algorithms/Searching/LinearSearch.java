package Algorithms.Searching;

/* Linear Search is a searching Algorithm that search a given element in the array
*  Complexity => O(n) Linear
*  TODO:: you can find more details using this link => https://youtu.be/iGnrCiHPOCg
*   try to copy paste the link if it is not working*/

public class LinearSearch {
    public int Search(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element)
                return i;
        }
        return -1;
    }
}

class LinearSearchMain {
    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        int array[] = {1, 5, 7, 69, 78, 6, 9, 5, 59, 65, 7, 9};
        int element = 6;
        System.out.println(linearSearch.Search(array, element));
    }
}
