package stack;

public class StackUsingArray {
    int size = 5;
    int top = -1;
    int[] array = new int[size];

    void push(int value) {
        if(top == size - 1) {
            System.out.println("Stack is full");
        } else {
            array[++top] = value;
            System.out.println(value + " is pushed to the stack");
        }
    }

    int peek() {
        if(!isEmpty()) {
            return array[top];
        } else {
            System.out.println("Stack is empty");
            return - 1;
        }
    }

    void pop() {
        if(top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(array[top] + " is popped from the stack");
            top--;
        }
    }

    void display() {
        if(top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.println(array[i]);
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