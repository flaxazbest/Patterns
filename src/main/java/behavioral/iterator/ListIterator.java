package behavioral.iterator;

import behavioral.iterator.LinkedList.Node;

public class ListIterator implements Iterator {

    private Node current;

    public ListIterator(Node head) {
        this.current = head;
    }

    @Override
    public int next() {
        int value = current.data();
        current = current.next();
        return value;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }
}
