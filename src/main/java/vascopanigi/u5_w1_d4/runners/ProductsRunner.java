package vascopanigi.u5_w1_d4.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import vascopanigi.u5_w1_d4.Config;
import vascopanigi.u5_w1_d4.entities.Pizza;
import vascopanigi.u5_w1_d4.services.ProductsService;

import java.util.Arrays;

@Component
public class ProductsRunner implements CommandLineRunner {
    @Autowired
    private ProductsService productsService;

    @Override
    public void run(String... args) throws Exception {
        Pizza newPizza = new Pizza("pizza troppo bona ao", Arrays.asList(Config.getPineapple(), Config.getCheese()));
        System.out.println(newPizza.getName());

        productsService.saveProduct(newPizza);
    }

}
