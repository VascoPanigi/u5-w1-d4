package vascopanigi.u5_w1_d4.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString

public class Pizza extends Product {
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
