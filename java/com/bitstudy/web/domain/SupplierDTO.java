package com.bitstudy.web.domain;

import lombok.Data;

/**
 * SupplierDTO
 */

@Data
public class SupplierDTO {

    private String supplierId, supplierName, contactName, address, city, postalCode, country, phone;
}