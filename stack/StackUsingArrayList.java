package stack;
import java.util.ArrayList;

public class StackUsingArrayList {
    private ArrayList<Integer> stackArrayList = new ArrayList<>();

    void push(int value) {
        stackArrayList.add(value);
        System.out.println(value + " is pushed to the stack");
    }

    int peek() {
        if(!isEmpty()) {
            return stackArrayList.get(size() -1);
        } else {
            System.out.println("Stack is empty");
            return - 1;
        }
    }

    void pop() {
        if(size() == 0) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(stackArrayList.remove(size() - 1) + " is popped from the stack");
        }
    }

    void display() {
        if(size() == 0) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i < size(); i++) {
                System.out.println(stackArrayList.get(i));
            }
        }
    }

    int size() {
        return stackArrayList.size();
    }

    boolean isEmpty() {
        return stackArrayList.size() == 0;
    }
}
