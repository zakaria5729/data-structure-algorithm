package queue;

public class LinearQueueUsingArray {
    private int inputSize = 5;
    private int[] queueArray = new int[5];
    private int rear = -1, front = -1;

    void enqueue(int value) {
        if(rear == inputSize - 1) {
            System.out.println("Queue is overflow/full");
        } else {
            if(front == -1) ++front;
            queueArray[++rear] = value;
            System.out.println(value + " enqueued");
        }
    }

    void dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is underflow/empty");
        } else {
            System.out.println(queueArray[front] + " dequeued");
            front++;
        }
    }

    void display() {
        if(isEmpty()) {
            System.out.println("Queue is underflow/empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.println(queueArray[i]);
            }
        }
    }

    int front() {
        if(!isEmpty()) {
            return queueArray[front];
        } else {
            System.out.println("Stack is empty");
            return - 1;
        }
    }

    int rear() {
        if(!isEmpty()) {
            return queueArray[rear];
        } else {
            System.out.println("Stack is empty");
            return - 1;
        }
    }

    int size() {
        return isEmpty() ? 0 : (rear - front) + 1;
    }

    boolean isEmpty() {
        return front == -1 || front > rear;
    }
}
