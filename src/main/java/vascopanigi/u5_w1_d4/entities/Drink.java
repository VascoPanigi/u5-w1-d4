package vascopanigi.u5_w1_d4.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "drinks")
public class Drink extends Product {
    @Id
    @GeneratedValue
    private UUID id;
    public Drink(String name, double price, int calories) {
        super(calories, price, name);
    }
}
