package com.bitstudy.web.domain;

import lombok.Data;

/**
 * Customer
 */

@Data
public class CustomerDTO {

    private String customerId, customerName, password, ssn, phone, city, address, postalcode, photo;

}