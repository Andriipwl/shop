package ua.com.owu.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString

public class OrderedProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Product product;
    private String FLS;
    private String email;
    private String phonenumber;
    private String address;

    public OrderedProduct(Product product,String FLS, String email, String phonenumber, String address) {
        this.product = product;
        this.FLS = FLS;
        this.email = email;
        this.phonenumber = phonenumber;
        this.address = address;
    }
}
