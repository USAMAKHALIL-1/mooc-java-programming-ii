import java.util.ArrayList;

public class ChangeHistory{
    private ArrayList<Double> history;

    public ChangeHistory() {
        history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        if (history.isEmpty()) {
            return 0.0;
        } else {
            Double max = history.get(0);
            for (double i : history) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        }
    }

    public double minValue() {
        if (history.isEmpty()) {
            return 0.0;
        } else {
            Double min = history.get(0);
            for (double i : history) {
                if (i < min) {
                    min = i;
                }
            }
            return min;
        }
    }

    public double average() {
        if (history.isEmpty()) {
            return 0.0;
        } else {
            double sum = 0.0;
            for (double i : history) {
                sum += i;
            }
            return sum / history.size();
        }
    }
}
