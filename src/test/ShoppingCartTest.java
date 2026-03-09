import org.junit.Test;
import static org.junit.Assert.*;

public class ShoppingCartTest {
    @Test
    public void testCartOperations() {
        ShoppingCart cart = new ShoppingCart();
        
        System.out.println("--- Starting Shopping Cart Test ---");
        
        // 1. Add Item
        cart.addItem("Laptop", 1000.0);
        System.out.println("Action: Added Laptop | Price: 1000.0");
        
        // 2. Add another Item
        cart.addItem("Mouse", 50.0);
        System.out.println("Action: Added Mouse | Price: 50.0");
        
        // 3. Show Total
        System.out.println("Current Calculated Total: " + cart.getTotalPrice());
        
        // 4. Remove Item
        cart.removeItem("Mouse");
        System.out.println("Action: Removed Mouse");
        
        // 5. Final Total
        double finalTotal = cart.getTotalPrice();
        System.out.println("Final Total Price: " + finalTotal);
        System.out.println("--- Test Completed Successfully ---");
        
        assertEquals(1000.0, finalTotal, 0.01);
    }
}
