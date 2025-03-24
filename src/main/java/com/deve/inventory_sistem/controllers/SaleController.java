package com.deve.inventory_sistem.controllers;

import com.deve.inventory_sistem.models.Sale;
import com.deve.inventory_sistem.services.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/sale")
public class SaleController {
    @Autowired
    private SalesService salesService;

    @GetMapping("/")
    public ResponseEntity<List<Sale>> getAllSales() {return ResponseEntity.ok(salesService.getAllSales()); }

    @GetMapping("")
}
