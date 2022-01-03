package queue.cirular;

public class CircularQueueUsingArray {
    private int itemCount = 0;
    private int rear = -1, front = -1;
    private int[] queueArray = {0, 0, 0, 0, 0};
    private int inputSize = queueArray.length;

    public void enqueue(int value) {
        if(isFull()) {
            System.out.println("Queue is overflow/full");
        } else {
            if(front == -1) ++front;
            rear = (rear + 1) % inputSize;
            queueArray[rear] = value;

            itemCount++;
            System.out.println(value + " enqueued");
        }
    }

    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is underflow/empty");
        } else {
            queueArray[front] = 0;

            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % inputSize;
            }

            itemCount--;
            System.out.println(queueArray[front] + " dequeued");
        }
    }

    public void display() {
        if(isEmpty()) {
            System.out.println("Queue is underflow/empty");
        } else {
            for (int i = 0; i < inputSize; i++) {
                System.out.println(queueArray[i]);
            }
        }
    }

    public int front() {
        if(!isEmpty()) {
            return queueArray[front];
        } else {
            System.out.println("Stack is empty");
            return - 1;
        }
    }

    public int rear() {
        if(!isEmpty()) {
            return queueArray[rear];
        } else {
            System.out.println("Stack is empty");
            return - 1;
        }
    }

    public int size() {
        return itemCount;
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public boolean isFull() {
        return (rear + 1) % inputSize == front;
    }
}
