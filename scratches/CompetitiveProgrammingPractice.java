import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class Question1 {
    // Please try not to change anything in this method.
    public static void main(String[] args) {
        int[] numbers = new int[15];
        addRandomNumbers(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(findPairs(numbers, 10));
    }

    // Please try not to change anything in this method.
    public static void addRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt() % 10;
        }
    }

    // Try to complete this method.
    public static List<String> findPairs(int[] numbers, int desiredSum) {

        List<String> list = new ArrayList<String>();
        for (int i = 0;i < numbers.length;i++) {
            for (int j = i + 1; j < numbers.length;j++) {
                if ((numbers[i] + numbers[j]) == desiredSum ) {
                    list.add("(" + numbers[i] + "," + numbers[j] + ")");
                }
            }
        }
        return list;
    }
}


