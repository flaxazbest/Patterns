package behavioral.iterator;

public class LinkedList implements Collection {

    private Node head;
    private Node current;

    @Override
    public Iterator getIterator() {
        return new ListIterator(head);
    }

    @Override
    public void insert(int value) {
        Node node = new Node(value);
        if (current == null) {
            head = node;
            current = node;
        }
        else {
            current.next = node;
            current = node;
        }
    }

    class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public int data() {
            return this.data;
        }

        public Node next() {
            return this.next;
        }
    }
}
