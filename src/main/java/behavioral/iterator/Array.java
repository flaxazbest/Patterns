package behavioral.iterator;

public class Array implements Collection {

    private int [] array;
    private int length;

    public Array(int size) {
        array = new int[size];
        this.length = 0;
    }

    @Override
    public Iterator getIterator() {
        return new ArrayIterator(array, length);
    }

    @Override
    public void insert(int value) {
        array[length++] = value;
    }
}
