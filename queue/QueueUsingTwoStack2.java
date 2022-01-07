package queue;

import java.util.Stack;

/*
 * ---- Steps ----
 * enqueue(x)
 * 1. S1 -> S2 (element by element)
 * 2. enqueue x -> S1
 * 3. S2 -> S1 (element by element)
 *
 * dequeue()
 * 1. S1.remove()
 */

public class QueueUsingTwoStack {
    private final Stack<Integer> primaryStack = new Stack<>();
    private final Stack<Integer> secondaryStack = new Stack<>();

    public void enqueue(int value) {
        while (!primaryStack.isEmpty()) {
            secondaryStack.push(primaryStack.pop());
        }

        primaryStack.push(value);

        while (!secondaryStack.isEmpty()) {
            primaryStack.push(secondaryStack.pop());
        }

        System.out.println(value + " is enqueued");
    }

    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println(primaryStack.pop() + " is dequeued");
    }

    public int peek() {
        if(!isEmpty()) {
            return primaryStack.peek();
        } else {
            System.out.println("Queue is empty");
            return - 1;
        }
    }

    public void display() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i = primaryStack.size() - 1; i >= 0; i--) {
            System.out.println(primaryStack.get(i));
        }
    }

    public int size() {
        return primaryStack.size();
    }

    public boolean isEmpty() {
        return primaryStack.isEmpty();
    }
}
