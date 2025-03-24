package com.deve.inventory_sistem.services;

import com.deve.inventory_sistem.models.Client;
import com.deve.inventory_sistem.models.Sale;
import com.deve.inventory_sistem.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesService {
    @Autowired
    private SaleRepository saleRepository;

    public Sale createNewSale(Sale sale){
        return saleRepository.save(sale);
    }

    public List<Sale> getAllSales(){
        return saleRepository.findAll();
    }

    public Sale findSaleById(Long id){
        return saleRepository.getById(id);
    }

    public List<Sale> findSaleByClient(Client client){
        return saleRepository.findByClient(client);
    }

    public void deleteSale(Long id){
        Sale sale = findSaleById(id);
        saleRepository.delete(sale);
    }

    public Sale updateSale(Sale sale){
        return saleRepository.save(sale);
    }
}
