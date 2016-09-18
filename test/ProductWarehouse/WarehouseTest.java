package ProductWarehouse;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarehouseTest {
    private static String WINGS_OF_FIRE_BOOK = "Wings of fire";


    @Test
    public void testWarehouseShouldAddProducts() {
        Warehouse warehouse = new Warehouse();

        warehouse.add(WINGS_OF_FIRE_BOOK, 10);

        assertEquals((Integer) 10, warehouse.getInventory(WINGS_OF_FIRE_BOOK));
    }

}
