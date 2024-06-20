package vascopanigi.u5_w1_d4.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Topping extends Product {
    public Topping(String name, double price, int calories) {
        super(calories, price, name);
    }
}
