package com.deve.inventory_sistem.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cardNumber;
    private String secureNumber;
    private LocalDateTime cardExpirationDate;

    // Constructor vacío
    public Client() {}

    public Client(String name){
        this.name = name;
    }

    // Constructor con parámetros
    public Client(String name, String cardNumber, String secureNumber, LocalDateTime cardExpirationDate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.secureNumber = secureNumber;
        this.cardExpirationDate = cardExpirationDate;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCardNumber() { return cardNumber; }
    public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }

    public String getSecureNumber() { return secureNumber; }
    public void setSecureNumber(String secureNumber) { this.secureNumber = secureNumber; }

    public LocalDateTime getCardExpirationDate() { return cardExpirationDate; }
    public void setCardExpirationDate(LocalDateTime cardExpirationDate) { this.cardExpirationDate = cardExpirationDate; }
}
