package stack;

import java.util.Queue;
import java.util.LinkedList;

/*
* ---- Steps ----
* push(x)
* 1. Add x -> Q
* 2. Take the top most element push it again (and remove the top) until the second last element
*
* pop()
* 1. Q1.remove()
*/

public class StackUsingSingleQueue {
    private final Queue<Integer> queue = new LinkedList<>();

    public void push(int value) {
        queue.add(value);

        for (int i = 0; i < queue.size() - 1; i++) {
            Integer removedItem = queue.remove();
            queue.add(removedItem);
        }
    }

    public void pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        Integer removedValue = queue.remove();
        System.out.println(removedValue + " is popped from the queue");
    }

    public Integer peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return - 1;
        }

        return queue.peek();
    }

    public Integer size() {
        return queue.size();
    }

    public boolean isEmpty () {
        return queue.isEmpty();
    }

    public void display() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        queue.forEach(System.out::println);
    }
}
