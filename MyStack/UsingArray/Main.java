package MyStack.UsingArray;

class Main {
    public static void main(String[] args) {
        // Max Size of Stack is 10 here but u can get the size by the user
        StackUsingArray<Integer> stackUsingArray = new StackUsingArray<>(10);
        // push operations
        stackUsingArray.push(10);
        stackUsingArray.push(20);
        stackUsingArray.push(30);
        stackUsingArray.push(40);
        stackUsingArray.push(50);

        // pop opertaions
        System.out.println(stackUsingArray.pop());

        // peek operation
        System.out.println(stackUsingArray.peek());

        // size of the stack
        System.out.println(stackUsingArray.size());

        //show
        stackUsingArray.show();
    }
}