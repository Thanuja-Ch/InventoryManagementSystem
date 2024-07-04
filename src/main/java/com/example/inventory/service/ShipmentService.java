package com.example.inventory.service;

import com.example.inventory.entity.Shipment;
import com.example.inventory.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShipmentService {

    @Autowired
    private ShipmentRepository shipmentRepository;

    public List<Shipment> getAllShipments() {
        return shipmentRepository.findAll();
    }

    public Optional<Shipment> getShipmentById(Long id) {
        return shipmentRepository.findById(id);
    }

    public Shipment addShipment(Shipment shipment) {
        return shipmentRepository.save(shipment);
    }

    public Shipment updateShipment(Long id, Shipment shipmentDetails) {
        Optional<Shipment> shipmentOptional = shipmentRepository.findById(id);
        if (shipmentOptional.isPresent()) {
            Shipment shipment = shipmentOptional.get();
            shipment.setSupplierId(shipmentDetails.getSupplierId());
            shipment.setItemId(shipmentDetails.getItemId());
            shipment.setQuantity(shipmentDetails.getQuantity());
            shipment.setShipmentDate(shipmentDetails.getShipmentDate());
            shipment.setStatus(shipmentDetails.getStatus());
            return shipmentRepository.save(shipment);
        }
        return null;
    }

    public void deleteShipment(Long id) {
        shipmentRepository.deleteById(id);
    }
}
