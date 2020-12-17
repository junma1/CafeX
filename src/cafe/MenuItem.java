package cafe;

public class MenuItem {

    private int id;

    private String name;

    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDrink() {
        return drink;
    }

    public void setDrink(boolean drink) {
        this.drink = drink;
    }

    private boolean drink;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MenuItem(int id, String name, double price, boolean drink) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.drink = drink;
    }

}
