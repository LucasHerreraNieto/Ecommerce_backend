package com.deve.inventory_sistem.services;

import com.deve.inventory_sistem.models.Client;
import com.deve.inventory_sistem.models.Sale;
import com.deve.inventory_sistem.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public Client createNewClient(Client client){return clientRepository.save(client);}
    public List<Client> getAllClient() {return clientRepository.findAll();}
    public Client findClientById(Long id){return clientRepository.getById(id);}

    public Client findClientBySale(Sale sale){return clientRepository.findBySale(sale);}
    public void deleteClient(Long id){
        Client client = findClientById(id);
        clientRepository.delete(client);
    }
    public Client updateClient(Client client){return clientRepository.save(client);}

}
