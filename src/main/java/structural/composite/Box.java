package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Item {
    int id;

    private List<Item> items = new ArrayList<>();

    public Box(int id) {
        this.id = id;
    }

    @Override
    public void print(int level) {
        for (int i=0; i<level; i++)
            System.out.print("  ");
        System.out.println("Box " + id);
        for (Item item: items)
            item.print(level + 1);
    }

    public void add(Item item) {
        items.add(item);
    }

    public void remove(Item item) {
        items.remove(item);
    }
}
