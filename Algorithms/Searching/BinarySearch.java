package Algorithms.Searching;

/* Binary Search is a Searching algorithm which uses divide and conquer technique
*  Complexity => O(log n) Logarithmic
*  NOTE :: The Binary Search algorithm works only on sorted data
*  TODO:: visit this link for more details => https://www.youtube.com/watch?v=7iE5xNOJET0
*   Copy paste link is it's not working */
//testing
public class BinarySearch {
    public int binarySearch(int array[], int element, int lb, int ub) {
        while (lb < ub) {
            int mid = (lb + ub) / 2;
            if (array[mid] < element)
                lb = mid + 1;
            else if (array[mid] > element)
                ub = mid - 1;
            else
                return mid;
        }
        return -1;
    }
}
class BinarySearchMain {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 9, 10};
        int element = 5;
        System.out.println(binarySearch.binarySearch(arr, element, 0, arr.length));

    }
}
