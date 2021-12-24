package stack;
import java.util.ArrayList;

public class StackUsingArrayList {
    private ArrayList<Integer> stackArrayList = new ArrayList<>();

    public void push(int value) {
        stackArrayList.add(value);
        System.out.println(value + " is pushed to the stack");
    }

    public int peek() {
        if(!isEmpty()) {
            return stackArrayList.get(size() -1);
        } else {
            System.out.println("Stack is empty");
            return - 1;
        }
    }

    public void pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(stackArrayList.remove(size() - 1) + " is popped from the stack");
        }
    }

    public void display() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i < size(); i++) {
                System.out.println(stackArrayList.get(i));
            }
        }
    }

    public int size() {
        return stackArrayList.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }
}
