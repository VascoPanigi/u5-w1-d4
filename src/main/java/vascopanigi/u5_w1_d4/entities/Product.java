package vascopanigi.u5_w1_d4.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Product {
    protected int calories;
    protected double price;
    private String name;

}
