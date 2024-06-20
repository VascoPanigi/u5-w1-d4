package vascopanigi.u5_w1_d4.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Product {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    protected UUID id;
    protected int calories;
    protected double price;
    private String name;
    private String ProductPhoto;

    public Product(int calories, double price, String name) {
        this.calories = calories;
        this.price = price;
        this.name = name;
    }
}
