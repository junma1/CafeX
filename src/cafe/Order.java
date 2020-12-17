package cafe;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<OrderEntry> entries = new ArrayList();

    public void add(int itemId, int quantity) {
        if (quantity <= 0) return;
        MenuItem menuItem = Menu.getItem(itemId);
        if (menuItem == null) return;
        OrderEntry orderEntry = new OrderEntry(menuItem, quantity);
        entries.add(orderEntry);
    }

    public double calculateBill() {
        double totalBill = 0.0;
        for (OrderEntry orderEntry : entries) {
            double price = orderEntry.menuItem.getPrice();
            int quantity = orderEntry.getQuantity();
            boolean isDrink = orderEntry.menuItem.isDrink();

            double itemCost = price * quantity;
            if (!isDrink) itemCost *= 1.1;
            totalBill += itemCost;
        }
        return Math.round(totalBill * 100.0) / 100.0;
    }

    public void printItems() {
        for (OrderEntry orderEntry : entries) {
            int id = orderEntry.menuItem.getId();
            String name = orderEntry.menuItem.getName();
            double price = orderEntry.menuItem.getPrice();
            int quantity = orderEntry.getQuantity();
            boolean isDrink = orderEntry.menuItem.isDrink();
            System.out.println("itemId: " + id + " | " + "name: " + name + " | " + "qty: " + quantity + " | " + "price: " + price + " | " + "tip: " + (isDrink ? "0%" : "10%"));

        }
    }

}
