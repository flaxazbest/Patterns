package behavioral.iterator;

public class IteratorClient {

    public static void main(String[] args) {
        Collection array = new Array(4);
        array.insert(1);
        array.insert(2);
        array.insert(3);
        array.insert(4);
        iterate(array.getIterator());


        Collection list = new Array(3);
        list.insert(11);
        list.insert(22);
        list.insert(33);
        iterate(list.getIterator());
    }

    public static void iterate(Iterator iter) {
        while(iter.hasNext())
            System.out.print(iter.next() + " ");
        System.out.println();
    }

}
