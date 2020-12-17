package cafe;

import java.util.HashMap;
import java.util.Map;

public class Menu {

    public static Map<Integer, MenuItem> items = new HashMap<>();

    private static void addItem(MenuItem item){
        items.put(item.getId(), item);
    }

    public static MenuItem getItem(int itemId){
        return items.get(itemId);
    }

    static {
        items = new HashMap<>();
        MenuItem item1 = new MenuItem(1, "Cola - Cold", 0.50, true);
        MenuItem item2 = new MenuItem(2, "Coffee - Hot", 1.00, true);
        MenuItem item3 = new MenuItem(3, "Cheese Sandwich - Cold", 2.00, false);
        MenuItem item4 = new MenuItem(4, "Steak Sandwich - Hot", 4.50, false);
        addItem(item1);
        addItem(item2);
        addItem(item3);
        addItem(item4);
    }
}
