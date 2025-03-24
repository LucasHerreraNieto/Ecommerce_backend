package com.deve.inventory_sistem.controllers;

import com.deve.inventory_sistem.models.Sale;
import com.deve.inventory_sistem.services.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/sale")
public class SaleController {
    @Autowired
    private SalesService salesService;

    @GetMapping("/")
    public ResponseEntity<List<Sale>> getAllSales() {return ResponseEntity.ok(salesService.getAllSales()); }

    @GetMapping("/{id}")
    public ResponseEntity<Sale> getSaleById(Long id){return ResponseEntity.ok(salesService.findSaleById(id));}

    @PostMapping("/")
    public ResponseEntity<Sale> ceateSale(@RequestBody Sale sale){
        return ResponseEntity.ok(salesService.createNewSale(sale));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Sale> updateSale(@PathVariable Long id, @RequestBody Sale sale){
        sale.setId(id);
        return ResponseEntity.ok(salesService.updateSale(sale));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteSale(@PathVariable Long id){
        salesService.deleteSale(id);
        return ResponseEntity.ok(true);
    }
}
