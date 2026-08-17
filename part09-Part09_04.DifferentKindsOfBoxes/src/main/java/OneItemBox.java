import java.util.ArrayList;

public class OneItemBox extends Box {
    private ArrayList<Item> item;

    public OneItemBox() {
        this.item = new ArrayList<>();
    }

    public void add(Item Item) {
        if (this.item.isEmpty()) {
            this.item.add(Item);
        }
    }

    public boolean isInBox(Item item) {
        return this.item.contains(item);
    }
}
