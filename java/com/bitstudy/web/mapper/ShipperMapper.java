package com.bitstudy.web.mapper;

import java.util.List;

import com.bitstudy.web.domain.ShipperDTO;

import org.springframework.stereotype.Repository;

/**
 * ShipperMapper
 */

@Repository
public interface ShipperMapper {
    // C
    public void insertShipper(ShipperDTO shipper);

    // R
    public List<ShipperDTO> selectShippers();

    public List<ShipperDTO> selectShippersByOption(ShipperDTO shipper);

    public ShipperDTO selectShipperByShipperId(String shipperId);

    // U
    public void updateShipper(ShipperDTO shipper);

    // D
    public void deleteShipper(ShipperDTO shipper);
}