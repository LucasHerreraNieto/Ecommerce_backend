package com.deve.inventory_sistem.repository;

import com.deve.inventory_sistem.models.Client;
import com.deve.inventory_sistem.models.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
    public List<Sale> findByClient(Client client);
    public Sale getById(Long id);
}
