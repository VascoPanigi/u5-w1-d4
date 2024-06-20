package vascopanigi.u5_w1_d4.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vascopanigi.u5_w1_d4.entities.Product;
import vascopanigi.u5_w1_d4.repositories.ProductRepository;

@Service
@Slf4j
public class ProductsService {
    @Autowired
    private ProductRepository productRepository;

    public void saveProduct(Product newProduct) {

        if (productRepository.existsByName(newProduct.getName())) {
            throw new RuntimeException("The Product with name " + newProduct.getName() + " already exists.");
        }
//        if (newProduct.getName().length() < 2) throw new RuntimeException("The name cannot be less than 2 character long");

        newProduct.setProductPhoto("https://placebear.com/200/300");

        productRepository.save(newProduct);

        log.info("New product {} saved!", newProduct.getName());
    }

}
