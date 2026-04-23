package supermarket.models;

import supermarket.interfaces.Sellable;


public class InventoryManager extends Product implements Sellable {
    private String supplierName;
    private String storageLocation;

    public InventoryManager() { super(); }

    public InventoryManager(String productId, String productName, double price, int quantity, String category, String supplierName, String storageLocation) {
        super(productId, productName, price, quantity, category);
        this.supplierName = supplierName;
        this.storageLocation = storageLocation;
    }

    public String getSupplierName() { return supplierName; }
    public String getStorageLocation() { return storageLocation; }


    @Override
    public double calculateDiscount() { return 0.0; } // Override in subclasses
    @Override
    public double applyTax() { return getPrice() * 0.18; } // Example 18% VAT
    @Override
    public boolean checkAvailability() { return getQuantity() > 0; }
    @Override
    public double calculateTotalValue() { return getPrice() * getQuantity(); }
    @Override
    public void updateStock(int quantity) { setQuantity(getQuantity() + quantity); }
    @Override
    public boolean validateProduct() { return getPrice() > 0 && getQuantity() >= 0; }
    @Override
    public String generateReport() { return "Report for: " + getProductName(); }
    @Override
    public String getCategoryDescription() { return "Category: " + getCategory(); }


    @Override
    public void processSale() {
        if (checkAvailability()) {
            updateStock(-1);
            System.out.println("Sale processed for " + getProductName());
        } else {
            System.out.println("Out of stock!");
        }
    }

    @Override
    public double calculateFinalPrice() {
        return getPrice() + applyTax() - calculateDiscount();
    }

    @Override
    public void printReceipt() {
        System.out.println("RECEIPT ");
        System.out.println("Item: " + getProductName());
        System.out.println("Final Price: " + calculateFinalPrice());
        System.out.println("                ");
    }
}