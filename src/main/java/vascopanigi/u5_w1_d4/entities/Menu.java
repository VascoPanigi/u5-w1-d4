package vascopanigi.u5_w1_d4.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Menu {
    private List<Pizza> pizzas;
    private List<Topping> toppings;
    private List<Drink> drinks;


    public void printMenu() {
        final int NAME_WIDTH = 45;
        final int PRICE_WIDTH = 10;
        final int CALORIES_WIDTH = 10;

        System.out.printf("%-" + NAME_WIDTH + "s%" + PRICE_WIDTH + "s%" + CALORIES_WIDTH + "s%n", "Pizzas", "Price", "Calories");

        for (Pizza pizza : pizzas) {

            System.out.printf("%-" + NAME_WIDTH + "s%" + PRICE_WIDTH + ".2f%" + CALORIES_WIDTH + "d%n", pizza.getName(), pizza.getPrice(), pizza.getCalories());
        }

        System.out.printf("\n%-" + NAME_WIDTH + "s%" + PRICE_WIDTH + "s%" + CALORIES_WIDTH + "s%n", "Toppings", "Price", "Calories");

        for (Topping topping : toppings) {
            System.out.printf("%-" + NAME_WIDTH + "s%" + PRICE_WIDTH + ".2f%" + CALORIES_WIDTH + "d%n", topping.getName(), topping.getPrice(), topping.getCalories());
        }

        System.out.printf("\n%-" + NAME_WIDTH + "s%" + PRICE_WIDTH + "s%" + CALORIES_WIDTH + "s%n", "Drinks", "Price", "Calories");

        for (Drink drink : drinks) {
            System.out.printf("%-" + NAME_WIDTH + "s%" + PRICE_WIDTH + ".2f%" + CALORIES_WIDTH + "d%n", drink.getName(), drink.getPrice(), drink.getCalories());
        }
    }
}
