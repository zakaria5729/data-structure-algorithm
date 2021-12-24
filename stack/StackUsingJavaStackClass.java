package stack;

import java.util.Stack;

public class StackUsingJavaStackClass {
    private final Stack<Integer> stack = new Stack<>();

    public void push(int value) {
        stack.push(value);
        System.out.println(value + " is pushed to the stack");
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(peek() + " is popped from the stack");
            stack.pop();
        }
    }

    public int peek() {
        return stack.peek();
    }

    public void display() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i <= size(); i++) {
                System.out.println(stack.get(i));
            }
        }
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
