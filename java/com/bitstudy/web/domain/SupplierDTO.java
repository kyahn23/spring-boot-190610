package com.bitstudy.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * SupplierDTO
 */

@Data @Component @Lazy
public class SupplierDTO {

    private String supplierId, supplierName, contactName, address, city, postalCode, country, phone;
}