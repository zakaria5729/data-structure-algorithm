package queue.linear;

import java.util.Queue;
import java.util.LinkedList;

public class LinearQueueUsingJavaQueueInterface {
    private int rear = -1;
    private final Queue<Integer> queue = new LinkedList<>();

    public void enqueue(int value) {
        queue.add(value);
        rear = value;
        System.out.println(value + " enqueued");
    }

    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is underflow/empty");
        } else {
            if(queue.size() == 1) {
                rear = -1;
            }

            System.out.println(queue.remove() + " dequeued");
        }
    }

    public void display() {
        if(isEmpty()) {
            System.out.println("Queue is underflow/empty");
        } else {
            System.out.println(queue);
        }
    }

    public Integer front() {
        if(!isEmpty()) {
            return queue.peek();
        } else {
            System.out.println("Stack is empty");
            return - 1;
        }
    }

    public int rear() {
        if(!isEmpty()) {
            return rear;
        } else {
            System.out.println("Stack is empty");
            return - 1;
        }
    }

    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
