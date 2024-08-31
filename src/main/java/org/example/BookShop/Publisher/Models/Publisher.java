package org.example.BookShop.Publisher.Models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Publishers")
public class Publisher {

    @Id
    private Long id;

    @Column(name = "name")
    private String name;

}
