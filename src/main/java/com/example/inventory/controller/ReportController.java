package com.example.inventory.controller;

import com.example.inventory.entity.Item;
import com.example.inventory.entity.Order;
import com.example.inventory.entity.Supplier;
import com.example.inventory.entity.Shipment;
import com.example.inventory.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/reports")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/items")
    public List<Item> getAllItems() {
        return reportService.getAllItems();
    }

    @GetMapping("/orders")
    public List<Order> getAllOrders() {
        return reportService.getAllOrders();
    }

    @GetMapping("/suppliers")
    public List<Supplier> getAllSuppliers() {
        return reportService.getAllSuppliers();
    }

    @GetMapping("/shipments")
    public List<Shipment> getAllShipments() {
        return reportService.getAllShipments();
    }
}
