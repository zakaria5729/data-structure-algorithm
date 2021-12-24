package stack;

public class StackUsingArray {
    private int inputSize = 5;
    private int top = -1;
    private int[] stackArray = new int[inputSize];

    public void push(int value) {
        if(top == inputSize - 1) {
            System.out.println("Stack is full");
        } else {
            stackArray[++top] = value;
            System.out.println(value + " is pushed to the stack");
        }
    }

    public int peek() {
        if(!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty");
            return - 1;
        }
    }

    public void pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(stackArray[top] + " is popped from the stack");
            top--;
        }
    }

    public void display() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.println(stackArray[i]);
            }
        }
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}