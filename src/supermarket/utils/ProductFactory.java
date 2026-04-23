package supermarket.utils;

import supermarket.models.*;

public class ProductFactory {
    public static Product createProduct(String category, String id, String name, double price, int qty) {

        switch (category.toLowerCase()) {
            case "food":
                return new FoodProduct(id, name, price, qty, "Food", "Supplier A", "Shelf 1", "2025-12-01");
            case "electronic":

                return new InventoryManager(id, name, price, qty, "Electronic", "Supplier B", "Shelf 2");
            default:
                return new InventoryManager(id, name, price, qty, category, "Generic Supplier", "Shelf 99");
        }
    }
}

