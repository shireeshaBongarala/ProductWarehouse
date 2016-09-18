package ProductWarehouse;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OrderTest {
    private static String WINGS_OF_FIRE_BOOK = "Wings of fire";
    private Warehouse warehouse;


    @Before
    public void setUp() {
        warehouse = new Warehouse();
        warehouse.add(WINGS_OF_FIRE_BOOK, 5);
    }

    @Test
    public void testOrderIsFilledIfEnoughInWarehouse() {
        Order order = new Order(WINGS_OF_FIRE_BOOK, 4);

        order.fill(warehouse);

        Assert.assertTrue(order.isFilled());
    }

    @Test
    public void testOrderIsFilledIfNotEnoughInWarehouse() {
        Order order = new Order(WINGS_OF_FIRE_BOOK, 10);

        order.fill(warehouse);

        Assert.assertFalse(order.isFilled());
    }
}
