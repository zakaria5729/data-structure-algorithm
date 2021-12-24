package queue.linear;

import java.util.ArrayList;

public class LinearQueueUsingArrayList {
    private ArrayList<Integer> queueArrayList = new ArrayList<>();

    void enqueue(int value) {
        queueArrayList.add(value);
        System.out.println(value + " enqueued");
    }

    void dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is underflow/empty");
        } else {
            System.out.println(queueArrayList.remove(0) + " dequeued");
        }
    }

    void display() {
        if(isEmpty()) {
            System.out.println("Queue is underflow/empty");
        } else {
            for (int i = 0; i < size(); i++) {
                System.out.println(queueArrayList.get(i));
            }
        }
    }

    int front() {
        if(!isEmpty()) {
            return queueArrayList.get(0);
        } else {
            System.out.println("Stack is empty");
            return - 1;
        }
    }

    int rear() {
        if(!isEmpty()) {
            return queueArrayList.get(size() - 1);
        } else {
            System.out.println("Stack is empty");
            return - 1;
        }
    }

    int size() {
        return queueArrayList.size();
    }

    boolean isEmpty() {
        return queueArrayList.isEmpty();
    }
}
