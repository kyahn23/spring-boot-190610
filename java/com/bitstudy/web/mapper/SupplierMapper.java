package com.bitstudy.web.mapper;

import java.util.List;

import com.bitstudy.web.domain.SupplierDTO;

import org.springframework.stereotype.Repository;

/**
 * SupplierMapper
 */

@Repository
public interface SupplierMapper {
    // C
    public void insertSupplier(SupplierDTO supplier);
    // R
    public List<SupplierDTO> selectSuppliers();
    public List<SupplierDTO> selectSuppliersByOption(SupplierDTO supplier);
    public SupplierDTO selectSupplierBySupplierId(String supplierId);
    // U
    public void updateSupplier(SupplierDTO supplier);
    // D
    public void deleteSupplier(SupplierDTO supplier);

}