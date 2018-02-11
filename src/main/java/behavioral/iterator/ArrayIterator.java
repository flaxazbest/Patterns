package behavioral.iterator;

public class ArrayIterator implements Iterator {

    private int [] array;
    private int pos;
    private int length;

    public ArrayIterator(int[] array, int length) {
        this.array = array;
        this.length = length;
        this.pos = -1;
    }

    @Override
    public int next() {
        return array[++pos];
    }

    @Override
    public boolean hasNext() {
        return (pos+1)<length;
    }
}
