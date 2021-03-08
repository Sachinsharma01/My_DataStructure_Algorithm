package MyQueue.UsingLinkedList;

public class Main {
    public static void main(String[] args) {
        // here max size is 10 but you can get it from user
        QueueUsingLinkedList<Integer> queueUsingLinkedList = new QueueUsingLinkedList<>(10);

        // enqueue operation
        queueUsingLinkedList.enqueue(10);
        queueUsingLinkedList.enqueue(20);
        queueUsingLinkedList.enqueue(30);
        queueUsingLinkedList.enqueue(40);
        queueUsingLinkedList.enqueue(50);

        // dequeue operation
        System.out.println(queueUsingLinkedList.dequeue());

        // show
        queueUsingLinkedList.show();
    }
}
