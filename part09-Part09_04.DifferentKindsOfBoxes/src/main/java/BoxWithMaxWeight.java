import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int maxcapacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {

        this.maxcapacity = capacity;
        this.items = new ArrayList<>();
    }

    public void add(Item item) {
        int currentweight = 0;
        for (Item i : items) {
            currentweight += i.getWeight();
        }
        if (item.getWeight() + currentweight <= maxcapacity) {
            this.items.add(item);
            currentweight += item.getWeight();
        }
    }

    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }

}
