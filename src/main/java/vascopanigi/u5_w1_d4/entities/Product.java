package vascopanigi.u5_w1_d4.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Product {
    protected int calories;
    protected double price;
    private String name;

}
