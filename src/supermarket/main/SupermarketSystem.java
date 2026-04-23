package supermarket.main;

import supermarket.models.*;
import supermarket.utils.*;

public class SupermarketSystem {
    public static void main(String[] args) {
        System.out.println(" WELCOME TO SUPERMARKET MANAGEMENT SYSTEM \n");


        String id = InputValidator.getNonEmptyString("Enter Product ID: ");
        String name = InputValidator.getNonEmptyString("Enter Product Name: ");
        String category = InputValidator.getNonEmptyString("Enter Category (Food/Electronic): ");
        double price = InputValidator.getPositiveDouble("Enter Price: ");
        int qty = InputValidator.getPositiveInt("Enter Quantity: ");


        Product product = ProductFactory.createProduct(category, id, name, price, qty);


        String custId = InputValidator.getNonEmptyString("Enter Customer ID: ");
        String custName = InputValidator.getNonEmptyString("Enter Customer Name: ");
        String phone = InputValidator.getNonEmptyString("Enter Phone Number: ");
        Customer customer = new Customer(custId, custName, phone);


        int orderQty = InputValidator.getPositiveInt("Enter Quantity to Purchase: ");
        Order order = new Order("ORD001", product, orderQty);


        System.out.println("\n--- ORDER SUMMARY ---");
        System.out.println(customer.toString());
        System.out.println(order.toString());


        if (product instanceof InventoryManager) {
            InventoryManager manager = (InventoryManager) product;
            manager.processSale();
            manager.printReceipt();
        }

        System.out.println("\n System Execution Complete!");
    }
}