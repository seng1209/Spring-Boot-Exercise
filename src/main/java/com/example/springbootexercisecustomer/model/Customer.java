package com.example.springbootexercisecustomer.model;

//import jakarta.persistence.*;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "customers")
@Setter
@Getter
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String customerLastName;
    @Column(nullable = false)
    private String customerFirstName;
    @Column(nullable = false, unique = true)
    private String customerPhone;

//    public Customer(int id, String customerLastName, String customerFirstName, String customerPhone) {
//        this.id = id;
//        this.customerLastName = customerLastName;
//        this.customerFirstName = customerFirstName;
//        this.customerPhone = customerPhone;
//    }
}
