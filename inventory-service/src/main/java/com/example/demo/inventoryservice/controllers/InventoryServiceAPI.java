package com.example.demo.inventoryservice.controllers;


import com.example.demo.inventoryservice.services.InventoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
public class InventoryServiceAPI {

    private InventoryService inventoryService;

    public InventoryServiceAPI(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping("/message/")
    public ResponseEntity<String> message(){
        String message = inventoryService.message();

        return ResponseEntity.ok(message);
    }
}
