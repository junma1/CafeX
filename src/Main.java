import cafe.Order;

public class Main {

    public static void main(String[] args) {
        Order order = new Order();
        order.add(1, 2); //2 cola
        order.add(1, -200);//invalid quantity
        order.add(2, 3); //1 coffee
        order.add(9, 3); //invalid item
        order.add(3, 1); //1 cheese sandwich
        order.add(3, 1); //1 more cheese sandwich
        order.add(4, 2); //2 steak sandwitch

        System.out.println("total bill: " + order.calculateBill()); //18.3
        order.printItems();
    }
}
