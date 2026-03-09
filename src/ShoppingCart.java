package src;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private double total = 0.0;

    public void addItem(String name, double price) {
        this.total += price;
    }

    public void removeItem(String name, double price) {
        this.total -= price;
    }

    public double getTotalPrice() {
        return total;
    }
}
