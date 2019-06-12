package com.bitstudy.web.domain;

import lombok.Data;

/**
 * OrderDTO
 */
@Data
public class OrderDTO {

    private String orderId, customerId, employeeId, orderDate, shipperId;
}