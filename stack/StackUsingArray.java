package stack;

public class StackUsingArray {
    private int inputSize = 5;
    private int top = -1;
    private int[] stackArray = new int[inputSize];

    void push(int value) {
        if(top == inputSize - 1) {
            System.out.println("Stack is full");
        } else {
            stackArray[++top] = value;
            System.out.println(value + " is pushed to the stack");
        }
    }

    int peek() {
        if(!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty");
            return - 1;
        }
    }

    void pop() {
        if(top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(stackArray[top] + " is popped from the stack");
            top--;
        }
    }

    void display() {
        if(top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.println(stackArray[i]);
            }
        }
    }

    int size() {
        return top + 1;
    }

    boolean isEmpty() {
        return top == -1;
    }
}