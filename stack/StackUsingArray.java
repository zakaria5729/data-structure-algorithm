package stack;

public class StackUsingArray {
    private int top = -1;
    private int[] array = {0, 0, 0, 0, 0};
    private int size = array.length;

    void push(int value) {
        if(isFull()) {
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
    
    boolean isFull() {
        return top == size - 1;
    }
}