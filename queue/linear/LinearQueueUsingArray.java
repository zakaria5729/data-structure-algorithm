package queue.linear;

public class LinearQueueUsingArray {
    private int[] queueArray = {0, 0, 0, 0, 0};
    private int inputSize = queueArray.length;
    private int rear = -1, front = -1;

    void enqueue(int value) {
        if(isFull()) {
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
            if (front == rear) {
                System.out.println(queueArray[front] + " dequeued");
                front = rear = -1;
            } else {
                System.out.println(queueArray[front] + " dequeued");
                front++;
            }
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
        return front == -1 && rear == -1;
    }

    boolean isFull() {
        return rear == inputSize - 1;
    }
}
