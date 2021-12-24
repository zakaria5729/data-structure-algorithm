package stack;

public class StackUsingLinkedList {
    private int size = 0;
    Node top = null;

    private static class Node {
        int data;
        Node link;

        Node(int data) {
            this.data = data;
        }
    }

    void push(int value) {
        Node temp = new Node(value);

        if(temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }

        temp.link = top;
        top = temp;
        size++;
        System.out.println(value + " is pushed to the stack");
    }

    void pop() {
        if(top == null) {
            System.out.println("Stack is empty");
        } else {
            top = top.link;
            size--;
        }
    }

    int peek() {
        if(!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is empty");
            return - 1;
        }
    }

    boolean isEmpty() {
        return top == null;
    }

    int size() {
        return size;
    }

    void display() {
        if(top == null) {
            System.out.println("Stack is empty");
        } else {
            Node temp = top;

            while(temp != null) {
                System.out.println(temp.data);
                temp = temp.link;
            }
        }
    }
}
