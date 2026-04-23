package supermarket.models;

public class ClothingProduct extends InventoryManager {
    private String size;

    public ClothingProduct(String productId, String productName, double price, int quantity,
                           String category, String supplier, String location, String size) {
        super(productId, productName, price, quantity, category, supplier, location);
        this.size = size;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }


    @Override
    public String getCategoryDescription() {
        return "Clothing - Size: " + size;
    }


    @Override
    public String toString() {
        return super.toString() + " [Clothing] Size: " + size;
    }

    public String getSize() { return size; }
}