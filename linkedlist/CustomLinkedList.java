package .idea.linkedlist;

import java.util.NoSuchElementException;

public class CustomLinkedList {
    private static class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(int item) {
        var node = new Node(item);

        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }

        size++;
    }

    public void reverse() {
        Node previous = first;
        Node current = first.next;

        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;
    }

    public void addFirst(int item) {
        var node = new Node(item);

        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }

        size++;
    }

    public int indexOf(int item) {
        int index = 0;
        Node current = first;

        while (current != null) {
            if (current.value == item) return index;
            current = current.next;
            index++;
        }

        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        checkNoSuchElement();

        if (first == last) {
            first = last = null;
        } else {
            Node second = first.next;
            first.next = null;
            first = second;
        }

        size--;
    }

    public void remove(int value) {
        Node current = first;

        while (current != null) {
            if (current.value == value) {
                Node previous = getPrevious(current);

                if (previous != null) {
                    previous.next = current.next;
                    current.next = null;
                } else { //first element
                    Node second = first.next;
                    first.next = null;
                    first = second;
                }

                size--;
                return;
            }

            current = current.next;
        }
    }

    public void removeAt(int index) {
        if (isInValidIndex(index))
            throw new IllegalArgumentException("Invalid index");

        Node current = first;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == index) {
                Node previous = getPrevious(current);

                if (previous != null) {
                    previous.next = current.next;
                    current.next = null;
                } else { //first element
                    Node second = first.next;
                    first.next = null;
                    first = second;
                }
                return;
            }

            currentIndex++;
            current = current.next;
        }

        size--;
    }

    public void removeLast() {
        checkNoSuchElement();

        if (first == last) {
            first = last = null;
        } else {
            Node previous = getPrevious(last);
            last = previous;
            if (last != null) last.next = null;
        }

        size--;
    }

    private boolean isInValidIndex(int index) {
        return index < 0 || index >= size;
    }

    private Node getPrevious(Node node) {
        Node current = first;

        while (current != null) {
            if (current.next == node) { //last node
                return current;
            }
            current = current.next;
        }

        return null;
    }

    private void checkNoSuchElement() {
        if (isEmpty()) throw new NoSuchElementException();
    }

    public int[] toArray() {
        int[] array = new int[size];
        Node current = first;
        int index = 0;

        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }

        return array;
    }

    public void print() {
        Node current = first;

        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return first == null;
    }
}
