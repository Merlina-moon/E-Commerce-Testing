package src.test; // Crucial: This must match the folder structure
import org.junit.Test;
import static org.junit.Assert.*;
import src.ShoppingCart;

public class ShoppingCartTest {
    @Test
    public void testCartOperations() {
        ShoppingCart cart = new ShoppingCart();
        System.out.println("--- Starting Shopping Cart Test ---");
        
        cart.addItem("Laptop", 1000.0);
        System.out.println("Action: Added Laptop | Price: 1000.0");
        
        cart.addItem("Mouse", 50.0);
        System.out.println("Action: Added Mouse | Price: 50.0");
        
        System.out.println("Current Total: " + cart.getTotalPrice());
        
        cart.removeItem("Mouse", 50.0);
        System.out.println("Action: Removed Mouse");
        
        double finalTotal = cart.getTotalPrice();
        System.out.println("Final Total Price: " + finalTotal);
        
        assertEquals(1000.0, finalTotal, 0.01);
    }
}
