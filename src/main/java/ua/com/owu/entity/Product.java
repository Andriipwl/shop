package ua.com.owu.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = "category")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int prise;
    private String description;
    private int count;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    CategoryOfProduct category = new CategoryOfProduct();

    public Product(String name, int prise, String description, int count) {
        this.name = name;
        this.prise = prise;
        this.description = description;
        this.count = count;
    }

}
