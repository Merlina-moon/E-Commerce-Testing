import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Double> items = new ArrayList<>();

    // Requirement (i): Add
    public void addItem(double price) {
        items.add(price);
    }

    // Requirement (ii): Remove
    public void removeItem(double price) {
        items.remove(Double.valueOf(price));
    }

    // Requirement (iii): Calculate total price
    public double getTotalPrice() {
        double total = 0;
        for (double p : items) {
            total += p;
        }
        return total;
    }
}
