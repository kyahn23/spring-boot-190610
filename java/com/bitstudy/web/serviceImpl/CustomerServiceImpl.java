package com.bitstudy.web.serviceImpl;

import java.util.List;

import com.bitstudy.web.domain.CustomerDTO;
import com.bitstudy.web.service.CustomerService;

import org.springframework.stereotype.Service;

/**
 * CustomerServiceImpl
 */

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public void addCustomer(CustomerDTO customer) {

    }

    @Override
    public List<CustomerDTO> findCustomers() {
        return null;
    }

    @Override
    public List<CustomerDTO> findCustomersByOption(CustomerDTO option) {
        return null;
    }

    @Override
    public CustomerDTO findCustomerByCustomerId(String customerId) {
        return null;
    }

    @Override
    public void updateCustomer(CustomerDTO customer) {

    }

    @Override
    public void deleteCustomer(CustomerDTO customer) {

    }

}