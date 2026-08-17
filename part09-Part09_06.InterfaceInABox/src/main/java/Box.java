import java.util.ArrayList;

public class Box implements Packable {
    private double capacity;
    private ArrayList<Packable> items;

    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public double weight() {
        double wieght = 0.0;
        for (Packable item : items) {
            wieght += item.weight();
        }
        return wieght;
    }

    public void add(Packable object) {
        if (capacity >= object.weight() + this.weight()) {
            this.items.add(object);
        }
    }
    
    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }
}
