package com.bitstudy.web.service;

import java.util.List;

import com.bitstudy.web.domain.CustomerDTO;

import org.springframework.stereotype.Component;

/**
 * CustomerService
 */

@Component
public interface CustomerService {
    
    //C
    public void addCustomer(CustomerDTO customer);
    //R
    public List<CustomerDTO> findCustomers();
    public List<CustomerDTO> findCustomersByOption(CustomerDTO option);
    public CustomerDTO findCustomerByCustomerId(String customerId);
    //U
    public void updateCustomer(CustomerDTO customer);
    //D
    public void deleteCustomer(CustomerDTO customer);


}