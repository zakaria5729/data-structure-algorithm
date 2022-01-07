package stack;

import java.util.Queue;
import java.util.LinkedList;

/*
* ---- Steps ----
* push(x)
* 1. Add x -> Q2
* 2. Q1 -> Q2 (element by element)
* 3. Swap (Q1 -> Q2)
*
* pop()
* 1. Q1.remove()
*/

public class StackUsingTwoQueue {
    private Queue<Integer> primaryQueue = new LinkedList<>();
    private Queue<Integer> secondaryQueue = new LinkedList<>();

    public void push(int value) {
        if (secondaryQueue == null) {
            secondaryQueue = new LinkedList<>();
        }

        secondaryQueue.add(value);

        while (!primaryQueue.isEmpty()) {
            secondaryQueue.add(primaryQueue.peek());
            primaryQueue.remove();
        }

        primaryQueue = secondaryQueue;
        secondaryQueue = null;
    }

    public void pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        Integer removedValue = primaryQueue.remove();
        System.out.println(removedValue + " is popped from the queue");
    }

    public Integer peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return - 1;
        }

        return primaryQueue.peek();
    }

    public Integer size() {
        return primaryQueue.size();
    }

    public boolean isEmpty () {
        return primaryQueue.isEmpty();
    }

    public void display() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        primaryQueue.forEach(System.out::println);
    }
}
