package vascopanigi.u5_w1_d4.entities;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
@Table(name = "toppings")
public class Topping extends Product {


//    @ManyToOne
//    @JoinColumn(name="topping_id")
//    private Topping topping;

    @ManyToMany(mappedBy = "toppings")
    private List<Pizza> pizzas;

    public Topping(String name, double price, int calories) {
        super(calories, price, name);
    }
}
