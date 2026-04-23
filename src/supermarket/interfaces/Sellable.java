package supermarket.interfaces;

public interface Sellable {
    void processSale();
    double calculateFinalPrice();
    void printReceipt();
}