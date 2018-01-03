package ua.com.owu.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@Getter
@Setter
@ToString
public class Item {
    private Product product = new Product();
    private int quantity;

    public Item(Product product, int quantity) {
        super();
        this.product = product;
        this.quantity = quantity;
    }
}
