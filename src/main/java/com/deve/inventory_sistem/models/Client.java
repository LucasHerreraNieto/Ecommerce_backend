package com.deve.inventory_sistem.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Sale> sales;

    @Transient // No se guarda en la base de datos
    private String cardNumber;

    @Transient // No se guarda en la base de datos
    private String secureNumber;

    @Transient // No se guarda en la base de datos
    private LocalDateTime cardExpirationDate;

    // Constructor vacío
    public Client() {}

    // Constructor con nombre
    public Client(String name){
        this.name = name;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<Sale> getSales() { return sales; }
    public void setSales(List<Sale> sales) { this.sales = sales; }
}
