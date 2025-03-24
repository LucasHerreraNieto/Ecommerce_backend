package com.deve.inventory_sistem.saleFactory;

import com.deve.inventory_sistem.models.Client;
import com.deve.inventory_sistem.models.Product;
import com.deve.inventory_sistem.models.Sale;

public interface SaleFactory {
    Sale createSale(Product product, Client client, String paymentMethod);
}
