package com.deve.inventory_sistem.repository;

import com.deve.inventory_sistem.models.Client;
import com.deve.inventory_sistem.models.Sale;
import com.deve.inventory_sistem.services.ClientService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
    public Client findBySale(Sale sale);
    public Client getById(Long id);
}
