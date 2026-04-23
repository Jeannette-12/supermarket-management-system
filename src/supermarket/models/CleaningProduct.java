package supermarket.models;

public class CleaningProduct extends InventoryManager {
    private String chemicalType;

    public CleaningProduct(String productId, String productName, double price, int quantity,
                           String category, String supplier, String location, String chemicalType) {
        super(productId, productName, price, quantity, category, supplier, location);
        this.chemicalType = chemicalType;
    }


    @Override
    public double calculateDiscount() {
        return getPrice() * 0.03;
    }

    @Override
    public String getCategoryDescription() {
        return "Cleaning - Type: " + chemicalType;
    }


    @Override
    public String toString() {
        return super.toString() + " [Cleaning] Type: " + chemicalType;
    }

    public String getChemicalType() { return chemicalType; }
}