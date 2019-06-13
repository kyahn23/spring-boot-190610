package com.bitstudy.web.service;

import java.util.List;

import com.bitstudy.web.domain.ShipperDTO;

import org.springframework.stereotype.Component;

/**
 * ShipperService
 */

@Component
public interface ShipperService {
    // C
    public void addShipper(ShipperDTO shipper);
    // R
    public List<ShipperDTO> findShippers();
    public List<ShipperDTO> findShippersByOption(ShipperDTO shipper);
    public ShipperDTO findShipperByShipperId(String shipperId);
    // U
    public void updateShipper(ShipperDTO shipper);
    // D
    public void deleteShipper(ShipperDTO shipper);
}