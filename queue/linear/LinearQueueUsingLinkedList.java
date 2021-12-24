package queue.linear;

public class LinearQueueUsingLinkedList {
    int size = 0;
    private Node rear = null, front = null;

    private static class Node {
        int data;
        Node link;

        Node(int data) {
            this.data = data;
        }
    }

    void enqueue(int value) {
        Node temp = new Node(value);

        if(temp == null) {
            System.out.println("Queue is overflow/full");
            return;
        }

        if(front == null) {
            front = rear = temp;
        } else {
            rear.link = temp;
            rear = temp;
        }

        size++;
        System.out.println(value + " enqueued");
    }

    void dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is underflow/empty");
        } else {
            System.out.println(front.data + " dequeued");
            front = front.link;
            size--;
        }
    }

    void display() {
        if(isEmpty()) {
            System.out.println("Queue is underflow/empty");
        } else {
            Node temp = front;

            while(temp != null) {
                System.out.println(temp.data);
                temp = temp.link;
            }
        }
    }

    int front() {
        if(!isEmpty()) {
            return front.data;
        } else {
            System.out.println("Stack is empty");
            return - 1;
        }
    }

    int rear() {
        if(!isEmpty()) {
            return rear.data;
        } else {
            System.out.println("Stack is empty");
            return - 1;
        }
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return front == null;
    }
}
