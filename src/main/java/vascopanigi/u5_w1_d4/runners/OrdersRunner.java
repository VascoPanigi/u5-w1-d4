package vascopanigi.u5_w1_d4.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import vascopanigi.u5_w1_d4.Config;
import vascopanigi.u5_w1_d4.entities.*;

@Component
public class OrdersRunner implements CommandLineRunner {
    @Autowired
    private Menu menu;

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Config.class);
        ctx.refresh();
        try {
            menu.printMenu();
            Table table1 = (Table) ctx.getBean("table1");
            Order order1 = new Order(table1, 2);

            order1.addProductToOrder(ctx.getBean("cola", Drink.class));
            order1.addProductToOrder(ctx.getBean("pepperoni_pizza", Pizza.class));
            order1.addProductToOrder(ctx.getBean("hawaiian_pizza", Pizza.class));
            order1.addProductToOrder(ctx.getBean("classic_pizza", Pizza.class));

            order1.printOrder();

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        } finally {
            ctx.close();
        }
    }
}
