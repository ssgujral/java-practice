package PriceDisplay;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PriceDisplayTest {
  @Test public void testReturnNameAndPrice() {
    PriceDisplay item = new PriceDisplay();
    
    String ItemName = "coffee";

    double Price = 3.0;

    
    assertEquals("Item should return the string: The price for item: <item name> is <price>", "The price for item: coffee is 3.00", item.getPriceLabel(ItemName, Price));
  }
}