package vascopanigi.u5_w1_d4.entities;

import vascopanigi.u5_w1_d4.enums.OrderState;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {
    private int orderNum;
    private int seatsNum;
    private OrderState state;
    private Table table;
    private LocalTime orderRequestTime;
    private List<Product> orderedProducts;

    public Order(Table table, int seatsNum) {
        Random random = new Random();
        this.orderNum = random.nextInt(1000, 5000);
        int randomNum = random.nextInt(1, 4);
        switch (randomNum) {
            case 1:
                this.state = OrderState.IN_PROGRESS;
            case 2:
                this.state = OrderState.READY;
            case 3:
                this.state = OrderState.SERVED;
        }
        this.orderRequestTime = LocalTime.now();
        this.orderedProducts = new ArrayList<>();
        this.seatsNum = seatsNum;
        this.table = table;
    }

    public void addProductToOrder(Product product) {
        this.orderedProducts.add(product);
    }

    public double getTotalPrice() {
        return this.orderedProducts.stream().mapToDouble(Product::getPrice).sum() + (this.table.getCoverPrice() * this.seatsNum);
    }

    public void printOrder() {
        System.out.println("Recap for order number " + this.orderNum);

        System.out.println("Number of seats: " + this.seatsNum);
        System.out.println("Time of the order " + this.orderRequestTime);
        System.out.println("Table number: " + this.table.getTableNumber());
        System.out.println("Products ");
        this.orderedProducts.forEach(System.out::println);
        System.out.println("Total: " + this.getTotalPrice());
    }
}
