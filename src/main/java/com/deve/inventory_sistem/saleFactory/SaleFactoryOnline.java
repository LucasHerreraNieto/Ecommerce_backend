package com.deve.inventory_sistem.saleFactory;

import com.deve.inventory_sistem.models.Client;
import com.deve.inventory_sistem.models.Product;
import com.deve.inventory_sistem.models.Sale;
import org.springframework.stereotype.Component;

@Component
public abstract class SaleFactoryOnline implements SaleFactory{
    @Override
    public Sale createSale(Product product, Client client, String paymentMethod) {
        switch (paymentMethod){
            case "credit_card":
               return new SaleFactoryCreditCard().createSale(product,client,paymentMethod);
            case "debit_card":
                return new SaleFactoryDebitCard().createSale(product, client,paymentMethod);
            default:
                throw new IllegalArgumentException("Método de pago no soportado: " + paymentMethod);
        }
    }
}
