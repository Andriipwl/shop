package ua.com.owu.entity;

import lombok.*;
import org.springframework.context.annotation.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String lastName;
    private int age;
    private String email;
    private String phoneNumber;
    private String location;

    public Client() {
    }

    public Client(String name, String lastName, int age, String email, String phoneNumber, String location) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }
}
