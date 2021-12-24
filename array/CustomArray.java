package array;

import java.util.List;
import java.util.NoSuchElementException;

public class CustomArray {
    private int size;
    private int[] items;

    public CustomArray(int length) {
        items = new int[length];
    }

    public boolean add(int element) {
        if (items.length == size) {
            int[] newItems = new int[size * 2];
            for (int i = 0; i < size; i++) newItems[i] = items[i];
            items = newItems;
        }

        items[size++] = element;
        return true;
    }

    public void add(int index, int element) {
        if (isInValidIndex(index))
            throw new IllegalArgumentException("Invalid index");

        if (items.length == size) shiftingArray(index, size * 2);
        else shiftingArray(index, size + 1);

        items[index] = element;
        size++;
    }

    private void shiftingArray(int index, int newSize) {
        int[] newItems = new int[newSize];

        for (int i = 0; i < size; i++) {
            if (i >= index) newItems[i + 1] = items[i];
            else newItems[i] = items[i];
        }
        items = newItems;
    }

    public boolean addAll(List<Integer> elements) {
        if (elements.isEmpty()) return false;

        if (size + elements.size() >= items.length) {
            int[] newItems = new int[(size + elements.size()) * 2];
            for (int i = 0; i < size; i++) newItems[i] = items[i];
            items = newItems;
        }

        for (int j = 0; j < elements.size(); j++) {
            items[size++] = elements.get(j);
        }
        return true;
    }

    public void removeAt(int index) {
        if (isInValidIndex(index))
            throw new IllegalArgumentException("Invalid index");

        for (int i = index; i < size; i++)
            items[i] = items[i + 1];

        size--;
    }

    public void removeLast() {
        if (isEmpty()) throw new NoSuchElementException();

        if (size == 1) {
            items = new int[0];
        } else {
            items[size() - 1] = items[size()];
        }

        size--;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private boolean isInValidIndex(int index) {
        return index < 0 || index >= size;
    }

    public int get(int index) {
        if (isInValidIndex(index))
            throw new IllegalArgumentException("Invalid index");

        return items[index];
    }

    public boolean contains(int element) {
        return indexOf(element) > 0;
    }

    public int indexOf(int element) {
        for (int i = 0; i < size; i++)
            if (items[i] == element) return i;

        return -1;
    }

    public int[] subList(int fromIndex, int toIndex) {
        if (isInValidIndex(fromIndex) || isInValidIndex(toIndex) || fromIndex > toIndex)
            throw new IllegalArgumentException("Invalid index range");

        int[] newItems = new int[toIndex - fromIndex];
        int counter = 0;
        for (int i = fromIndex; i < toIndex; i++) {
            newItems[counter++] = items[i];
        }

        return newItems;
    }

    public int lastIndexOf(int element) {
        int index = -1;

        for (int i = 0; i < size; i++)
            if (items[i] == element) index = i;

        return index;
    }

    public boolean remove(int value) {
        boolean isRemoved = false;

        for (int i = 0; i < size; i++) {
            if (items[i] == value) {
                items[i] = items[i + 1];
                isRemoved = true;
            }
        }

        if (isRemoved) size--;
        return isRemoved;
    }

    public int size() {
        return size;
    }

    public void clear() {
        items = null;
        size = 0;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(items[i]);
        }
    }
}
