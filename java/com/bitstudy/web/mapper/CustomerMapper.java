package com.bitstudy.web.mapper;

import java.util.List;

import com.bitstudy.web.domain.CustomerDTO;

import org.springframework.stereotype.Repository;

/**
 * CustomerMapper
 */

 @Repository
public interface CustomerMapper {
// C
public void insertCustomer(CustomerDTO customer);
// R
public List<CustomerDTO> selectCustomers();
public List<CustomerDTO> selectCustomersByOption(CustomerDTO customer);
public CustomerDTO selectCustomerByCustomerId(String customerId);
// U
public void updateCustomer(CustomerDTO customer);
// D
public void deleteCustomer(CustomerDTO customer);
public int selectCount();

//로그인
public CustomerDTO login(CustomerDTO customer);
    
}