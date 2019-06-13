package com.bitstudy.web.service;

import java.util.List;

import com.bitstudy.web.domain.OrderDTO;

import org.springframework.stereotype.Component;

/**
 * OrderService
 */

@Component
public interface OrderService {
    // C
    public void addOrder(OrderDTO Order);
    // R
    public List<OrderDTO> findOrders();
    public List<OrderDTO> findOrdersByOption(OrderDTO order);
    public OrderDTO findOrderByOrderId(String orderId);
    // U
    public void updateOrder(OrderDTO order);
    // D
    public void deleteOrder(OrderDTO order);
    
}