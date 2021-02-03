import java.util.*;

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

        var list = new ArrayList<String>();
        Arrays.sort(numbers);
        var leftPointer = 0;
        var rightPointer = numbers.length - 1;
        while (leftPointer < rightPointer) {
            var firstNumber = numbers[leftPointer];
            var secondNumber = numbers[rightPointer];
            var currentSum = firstNumber + secondNumber;
            if (currentSum == desiredSum) {
                var pair = new Pair<> (firstNumber, secondNumber);
                list.add(pair.toString());
                leftPointer++;
                rightPointer--;
            }
            else if (currentSum < desiredSum)
                leftPointer++;
            else
                rightPointer--;
        }
        return list;
    }

    private static class Pair <F extends Number, S extends Number> {
        private F firstNumber;
        private S secondNumber;

        @Override
        public String toString() {
            return "Pair{" +
                    "firstNumber=" + firstNumber +
                    ", secondNumber=" + secondNumber +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(firstNumber, pair.firstNumber) && Objects.equals(secondNumber, pair.secondNumber);
        }

        @Override
        public int hashCode() {
            return Objects.hash(firstNumber, secondNumber);
        }

        public F getFirstNumber() {
            return firstNumber;
        }

        public void setFirstNumber(F firstNumber) {
            this.firstNumber = firstNumber;
        }

        public S getSecondNumber() {
            return secondNumber;
        }

        public void setSecondNumber(S secondNumber) {
            this.secondNumber = secondNumber;
        }

        public Pair(F firstNumber, S secondNumber) {
            this.firstNumber = firstNumber;
            this.secondNumber = secondNumber;
        }
    }
}


