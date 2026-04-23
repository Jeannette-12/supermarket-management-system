package supermarket.models;

public class FoodProduct extends InventoryManager {
    private String expiryDate;

    public FoodProduct(String productId, String productName, double price, int quantity, String category, String supplier, String location, String expiryDate) {
        super(productId, productName, price, quantity, category, supplier, location);
        this.expiryDate = expiryDate;
    }


    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    } // 5% food discount
    @Override
    public String getCategoryDescription() {
        return "Food Item - Expiry: " + expiryDate;
    }
    @Override
    public String toString() {

        return super.toString() + " [FoodProduct] Expiry: " + expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }
}