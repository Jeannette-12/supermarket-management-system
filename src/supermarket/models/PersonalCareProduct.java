package supermarket.models;

public class PersonalCareProduct extends InventoryManager {
    private String skinType; // e.g., Oily, Dry, Sensitive

    public PersonalCareProduct(String productId, String productName, double price, int quantity,
                               String category, String supplier, String location, String skinType) {
        super(productId, productName, price, quantity, category, supplier, location);
        this.skinType = skinType;
    }


    @Override
    public double calculateDiscount() {
        return getPrice() * 0.07;
    }


    @Override
    public String getCategoryDescription() {
        return "Personal Care - Suitable for: " + skinType;
    }

    @Override
    public String toString() {
        return super.toString() + " [Personal Care] Skin Type: " + skinType;
    }

    public String getSkinType() { return skinType; }
}