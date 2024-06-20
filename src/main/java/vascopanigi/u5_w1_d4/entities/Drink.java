package vascopanigi.u5_w1_d4.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Drink extends Product {
    public Drink(String name, double price, int calories) {
        super(calories, price, name);
    }
}
