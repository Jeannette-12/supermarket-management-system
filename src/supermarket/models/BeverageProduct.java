package supermarket.models;

public class BeverageProduct extends InventoryManager {
    private double volumeInMl;

    public BeverageProduct(String productId, String productName, double price, int quantity,
                           String category, String supplier, String location, double volumeInMl) {
        super(productId, productName, price, quantity, category, supplier, location);
        this.volumeInMl = volumeInMl;
    }


    @Override
    public double calculateDiscount() {
        return getPrice() * 0.02;
    }

    @Override
    public String getCategoryDescription() {
        return "Beverage - Volume: " + volumeInMl + "ml";
    }

    @Override
    public String toString() {
        return super.toString() + " [Beverage] Volume: " + volumeInMl + "ml";
    }

    public double getVolumeInMl() { return volumeInMl; }
}