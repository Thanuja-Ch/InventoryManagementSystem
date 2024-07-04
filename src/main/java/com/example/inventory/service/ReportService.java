package com.example.inventory.service;

import com.example.inventory.entity.Item;
import com.example.inventory.entity.Order;
import com.example.inventory.entity.Supplier;
import com.example.inventory.entity.Shipment;
import com.example.inventory.repository.ItemRepository;
import com.example.inventory.repository.OrderRepository;
import com.example.inventory.repository.SupplierRepository;
import com.example.inventory.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private SupplierRepository supplierRepository;

    @Autowired
    private ShipmentRepository shipmentRepository;

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }

    public List<Shipment> getAllShipments() {
        return shipmentRepository.findAll();
    }
}
