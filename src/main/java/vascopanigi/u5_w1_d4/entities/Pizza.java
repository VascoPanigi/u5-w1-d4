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
@NoArgsConstructor
@Entity
@Table(name = "pizzas")
public class Pizza extends Product {


//    @OneToMany(mappedBy = "topping", cascade = CascadeType.ALL)
//    private List<Topping> toppings;
@ManyToMany(cascade = CascadeType.ALL)
@JoinTable(
        name = "pizza_toppings",
        joinColumns = @JoinColumn(name = "pizza_id"),
        inverseJoinColumns = @JoinColumn(name = "topping_id")
)
private List<Topping> toppings;


    public Pizza(String name, List<Topping> toppings) {
        super(500, 4.99, name);
        this.toppings = toppings;
    }

    //metodi per sommare prezzo e categorie -----
    @Override
    public double getPrice() {
        return super.getPrice() + this.toppings.stream().mapToDouble(Topping::getPrice).sum();
    }

    @Override
    public int getCalories() {
        return super.getCalories() + this.toppings.stream().mapToInt(Topping::getCalories).sum();
    }


}
