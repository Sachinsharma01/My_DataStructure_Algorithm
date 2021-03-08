package MyQueue.UsingArray;

public class Main {
    public static void main(String[] args) {
        QueueArray<Integer> queueArray = new QueueArray<>(5);
        queueArray.enqueue(1);
        queueArray.enqueue(2);
        queueArray.enqueue(3);
        queueArray.enqueue(4);
        queueArray.enqueue(5);

        System.out.println("\n"+queueArray.dequeue() + "\n");

        queueArray.show();
    }
}
