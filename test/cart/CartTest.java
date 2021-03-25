package cart;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CartTest {
    @Test
    public void testTotalNumOfItemsInCart(){
        Cart ct = new Cart();
        ct.put("1234");
        ct.put("1234");
        ct.put("3456");
        ct.put("3456");
        ct.put("3456");
        ct.put("3456");
        ct.put("6789");
        int totalNum1 = ct.getTotalNumOfItemsInCart("1234");
        assertEquals(2, totalNum1);
        int totalNum2 = ct.getTotalNumOfItemsInCart("3456");
        assertEquals(4, totalNum2);
        int totalNum3 = ct.getTotalNumOfItemsInCart("6789");
        assertEquals(1, totalNum3);
    }
    @Test
    public void testTotalPrice(){
        Cart ct = new Cart();
        PriceManager pm = mock(PriceManager.class);
        when(pm.getPrice("1234")).thenReturn(1000);
        when(pm.getPrice("6789")).thenReturn(800);
        ct.setPriceManager(pm);

        ct.put("1234");
        int total1 = ct.totalPrice();
        assertEquals(1000, total1);

        ct.put("6789");
        int total2 = ct.totalPrice();
        assertEquals(1800, total2);

    }
}