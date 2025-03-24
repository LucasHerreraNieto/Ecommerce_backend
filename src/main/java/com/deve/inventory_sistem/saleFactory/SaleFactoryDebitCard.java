package com.deve.inventory_sistem.saleFactory;

import com.deve.inventory_sistem.models.Client;
import com.deve.inventory_sistem.models.Product;
import com.deve.inventory_sistem.models.Sale;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class SaleFactoryDebitCard implements SaleFactory{

    @Override
    public Sale createSale(Product product, Client client,String paymentMethod){
        boolean isValid = verifyDebitCard(client.getCardNumber(), client.getSecureNumber(), client.getCardExpirationDate());

        if (!isValid) {
            throw new IllegalArgumentException("Tarjeta de crédito no válida.");
        }

        // Crear y devolver la venta
        return new Sale(product, client, LocalDateTime.now(), "DEBIT_CARD");
    }
    public boolean verifyDebitCard(String cardNumber,String secureNumber, LocalDateTime expirationDate){
        if (cardNumber == null || secureNumber == null || expirationDate == null) {
            return false;
        }
        return expirationDate.isAfter(LocalDateTime.now()); // La tarjeta no debe estar vencida
    }

}
