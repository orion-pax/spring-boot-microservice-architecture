package com.example.demo.inventoryservice.services;

import org.springframework.stereotype.Service;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Override
    public String message() {
        return " Welcome to the Inventory Service...";
    }
}
