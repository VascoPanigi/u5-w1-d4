package vascopanigi.u5_w1_d4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import vascopanigi.u5_w1_d4.entities.*;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("application.properties")
public class Config {

    @Bean(name = "cheese")
    public Topping getCheese() {
        return new Topping("cheese", 1.00, 150);
    }

    @Bean(name = "tomato")
    public Topping getTomato() {
        return new Topping("tomato", 1.00, 50);
    }

    @Bean(name = "pineapple")
    public Topping getPineapple() {
        return new Topping("pineapple", 30.00, 200);
    }

    @Bean(name = "pepperoni")
    public Topping getPepperoni() {
        return new Topping("pepperoni", 2.50, 300);
    }

    @Bean(name = "ham")
    public Topping getHam() {
        return new Topping("ham", 2.00, 250);
    }

    @Bean(name = "hawaiian_pizza")
    public Pizza getHawaiianPizza() {
        return new Pizza("hawaiian", Arrays.asList(getPineapple(), getCheese()));
    }

    @Bean(name = "pepperoni_pizza")
    public Pizza getPepperoniPizza() {
        return new Pizza("pepperoni", Arrays.asList(getPepperoni(), getCheese()));
    }

    @Bean(name = "classic_pizza")
    public Pizza getClassicPizza() {
        return new Pizza("classic", Arrays.asList(getCheese(), getTomato()));
    }

    @Bean(name = "water")
    public Drink getWater() {
        return new Drink("water", 1.50, 50);
    }

    @Bean(name = "cola")
    public Drink getCola() {
        return new Drink("cola", 3.50, 300);
    }

    @Bean(name = "table1")
    public Table getTable1(@Value("${cover.price}") double coverPrice) {
        return new Table(1, 10, coverPrice, false);
    }

    @Bean(name = "table2")
    Table getTable2(@Value("${cover.price}") double coverPrice) {
        return new Table(2, 5, coverPrice, false);
    }

    @Bean(name = "menu")
    public Menu menu() {
        List<Pizza> pizzas = Arrays.asList(getClassicPizza(), getHawaiianPizza(), getPepperoniPizza());
        List<Topping> toppings = Arrays.asList(getPineapple(), getPepperoni(), getHam(), getCheese());
        List<Drink> drinks = Arrays.asList(getCola(), getWater());
        return new Menu(pizzas, toppings, drinks);
    }
}
