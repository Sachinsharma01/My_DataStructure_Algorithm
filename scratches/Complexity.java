class Scratch {
    public static void main(String[] args) {
        message("Hello");
        int[] arr = {1};
        printArrayElements(arr);
        printString(1000);
    }
    // O(1) constant time
    private static void message(String message) {
        System.out.println(message);
    }
    // O(n) linear time
    private static void printArrayElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    // O(log n) logarithmic time
    private static void printString(int n) {
        for (int i = 1; i < n; i *= 2) {
            System.out.println("i = " + i);
        }
    }
    // O(n^n) Quadratic Complexity and id in j n = m then O(n * m)
    private static void printNestedLoops (int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("(i*j) = " + (i * j));
            }
        }
    }
}