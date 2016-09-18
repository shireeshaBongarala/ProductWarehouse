package ProductWarehouse;

public class Order {

    private String product;
    private Integer quantity;
    private Boolean filled;

    public Order(String product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
        this.filled = false;
    }

    public void fill(Warehouse warehouse) {
        if(warehouse.getInventory(product) >= quantity){
            warehouse.removeInventory(product, quantity);
            filled = true;
        }
    }

    public boolean isFilled() {
        return filled;
    }
}
