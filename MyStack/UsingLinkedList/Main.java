package MyStack.UsingLinkedList;

public class Main {
    public static void main(String[] args) {
        StackUsingLinkedList<Integer> stackUsingLinkedList = new StackUsingLinkedList<>(10);

        stackUsingLinkedList.push(10);
        stackUsingLinkedList.push(20);
        stackUsingLinkedList.push(30);
        stackUsingLinkedList.push(40);
        stackUsingLinkedList.push(50);
        // pop opertaion
        System.out.println(stackUsingLinkedList.pop());

        // peek operation
        System.out.println(stackUsingLinkedList.peek());

        // size of the stack
        System.out.println(stackUsingLinkedList.size());

        //show
        stackUsingLinkedList.show();
    }
}
