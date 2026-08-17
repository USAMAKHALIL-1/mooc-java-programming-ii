import java.util.ArrayList;

public class Herd implements Movable {
    private ArrayList<Movable> list;

    public Herd() {
        this.list = new ArrayList<>();
    }

    public String toString() {
        StringBuilder all = new StringBuilder();
        for (Movable item : list) {
            all.append(item).append("\n");
        }
        return all.toString();
    }

    public void addToHerd(Movable movable) {
        list.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable item : list) {
            item.move(dx, dy);
        }
    }
}
