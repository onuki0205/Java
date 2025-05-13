package algorithm.dataStructure;

import java.util.*;

public class Queue {
    private LinkedList<Object> list = new LinkedList<Object>();

    public void enqueue(Object item) {
        list.addLast(item);
    }

    public Object dequeue() {
        return list.removeFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public Object peek() {
        return list.getFirst();
    }
}