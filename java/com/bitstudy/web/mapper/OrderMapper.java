package com.bitstudy.web.mapper;

import java.util.List;

import com.bitstudy.web.domain.OrderDTO;

import org.springframework.stereotype.Repository;

/**
 * OrderMapper
 */

@Repository
public interface OrderMapper {
    // C
    public void insertOrder(OrderDTO Order);

    // R
    public List<OrderDTO> selectOrders();

    public List<OrderDTO> selectOrdersByOption(OrderDTO order);

    public OrderDTO selectOrderByOrderId(String orderId);

    // U
    public void updateOrder(OrderDTO order);

    // D
    public void deleteOrder(OrderDTO order);
}