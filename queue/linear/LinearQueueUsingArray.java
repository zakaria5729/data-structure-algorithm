package queue.linear;

public class LinearQueueUsingArray {
    private int inputSize = 5;
    private int[] queueArray = new int[5];
    private int rear = -1, front = -1;

    public void enqueue(int value) {
        if(rear == inputSize - 1) {
            System.out.println("Queue is overflow/full");
        } else {
            if(front == -1) ++front;
            queueArray[++rear] = value;
            System.out.println(value + " enqueued");
        }
    }

    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is underflow/empty");
        } else {
            System.out.println(queueArray[front] + " dequeued");
            front++;
        }
    }

    public void display() {
        if(isEmpty()) {
            System.out.println("Queue is underflow/empty");
        } else {
            for (int i = front; i <= rear; i++) {
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
        return isEmpty() ? 0 : (rear - front) + 1;
    }

    public boolean isEmpty() {
        return front == -1 || front > rear;
    }
}
