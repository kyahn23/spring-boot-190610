package com.bitstudy.web.service;

import java.util.List;

import com.bitstudy.web.domain.SupplierDTO;

import org.springframework.stereotype.Component;

/**
 * SupplierService
 */

@Component
public interface SupplierService {
    // C
    public void addSupplier(SupplierDTO supplier);
    // R
    public List<SupplierDTO> findSuppliers();
    public List<SupplierDTO> findSuppliersByOption(SupplierDTO supplier);
    public SupplierDTO findSupplierBySupplierId(String supplierId);
    // U
    public void updateSupplier(SupplierDTO supplier);
    // D
    public void deleteSupplier(SupplierDTO supplier);

}