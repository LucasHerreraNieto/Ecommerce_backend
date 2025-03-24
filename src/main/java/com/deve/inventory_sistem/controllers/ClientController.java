package com.deve.inventory_sistem.controllers;

import com.deve.inventory_sistem.models.Client;
import com.deve.inventory_sistem.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/")
    public ResponseEntity<List<Client>> getAllClient() {return ResponseEntity.ok(clientService.getAllClient());}

    @PostMapping("/")
    public ResponseEntity<Client> createClient(@RequestBody Client client){return ResponseEntity.ok(clientService.createNewClient(client));}

    @GetMapping("/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable Long id){return ResponseEntity.ok(clientService.findClientById(id));}

    @PutMapping("/{id}")
    public ResponseEntity<Client> updateClient(@PathVariable Long id, @RequestBody Client client){
        client.setId(id);
        return ResponseEntity.ok(clientService.updateClient(client));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteClient(@PathVariable Long id){
        clientService.deleteClient(id);
        return ResponseEntity.ok(true);
    }
}
