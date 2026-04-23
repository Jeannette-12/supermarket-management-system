package supermarket.models;

public class Order {
    private String orderId;
    private Product product;
    private int quantityPurchased;
    private double totalPrice;

    public Order(String orderId, Product product, int quantityPurchased) {
        this.orderId = orderId;
        this.product = product;
        this.quantityPurchased = quantityPurchased;
        this.totalPrice = calculateTotalPrice();
    }

    public double calculateTotalPrice() {

        return product.getPrice() * quantityPurchased;
    }

    @Override
    public String toString() {
        return "Order{" + "ID='" + orderId + '\'' + ", Product=" + product.getProductName() + ", Total=" + totalPrice + '}';
    }
}