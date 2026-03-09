import org.junit.Test;
import static org.junit.Assert.*;

public class ShoppingCartTest {

    @Test
    public void testShoppingCartFunctionality() {
    
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(50.0);
        cart.addItem(30.0);
        cart.addItem(20.0);
        
        assertEquals("Requirement (iii) Failed: Total price calculation is incorrect", 
                     100.0, cart.getTotalPrice(), 0.01);

        cart.removeItem(30.0);
        
        assertEquals("Requirement (ii) Failed: Total price after removal is incorrect", 
                     70.0, cart.getTotalPrice(), 0.01);
    }
}
