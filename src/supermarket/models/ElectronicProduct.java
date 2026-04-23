package supermarket.models;

public class ElectronicProduct extends InventoryManager {
    private int warrantyPeriodMonths;

    public ElectronicProduct(String productId, String productName, double price, int quantity,
                             String category, String supplier, String location, int warrantyPeriodMonths) {
        super(productId, productName, price, quantity, category, supplier, location);
        this.warrantyPeriodMonths = warrantyPeriodMonths;
    }


    @Override
    public double calculateDiscount() {
        return 0.0;
    }


    @Override
    public String getCategoryDescription() {
        return "Electronics - Warranty: " + warrantyPeriodMonths + " months";
    }


    @Override
    public String toString() {
        return super.toString() + " [Electronic] Warranty: " + warrantyPeriodMonths + " months";
    }

    public int getWarrantyPeriodMonths() { return warrantyPeriodMonths; }
}