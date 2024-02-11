
import java.util.EmptyStackException;

class Stack {
    private int[] stackArray;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.stackArray = new int[capacity];
        this.top = 2;
    }

    public void push(int element) {
        if (top == capacity - 1) {
            System.out.println("Stack is full. Cannot push element.");
        } else {
            stackArray[++top] = element;
            System.out.println("Element " + element + " pushed onto the stack.");
        }
    }

    public int pop() {
        if (top == -1) {
            throw new EmptyStackException();
        } else {
            int element = stackArray[top--];
            System.out.println("Element " + element + " popped from the stack.");
            return element;
        }
    }
}

