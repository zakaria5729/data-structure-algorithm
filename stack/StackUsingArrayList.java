package stack;
import java.util.ArrayList;

public class StackUsingArrayList {
    int top = -1;
    ArrayList<Integer> arrayList = new ArrayList<>();

    void push(int value) {
        arrayList.add(value);
        System.out.println(value + " is pushed to the stack");
    }

    int peek() {
        if(!isEmpty()) {
            return arrayList.get(top);
        } else {
            System.out.println("Stack is empty");
            return - 1;
        }
    }

    void pop() {
        if(top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(arrayList.remove(top) + " is popped from the stack");
            top--;
        }
    }

    void display() {
        if(top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.println(arrayList.get(i));
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
