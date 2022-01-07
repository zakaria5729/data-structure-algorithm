package stack;

public class StackUsingLinkedList {
    private int size = 0;
    private Node top = null;

    private static class Node {
        private int data;
        private Node link;

        Node(int data) {
            this.data = data;
        }
    }

    public void push(int value) {
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

    public void pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            top = top.link;
            size--;
        }
    }

    public int peek() {
        if(!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is empty");
            return - 1;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public void display() {
        if(isEmpty()) {
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
