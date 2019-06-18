package com.bitstudy.web.serviceImpl;

import java.util.List;

import com.bitstudy.web.domain.CustomerDTO;
import com.bitstudy.web.mapper.CustomerMapper;
import com.bitstudy.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CustomerServiceImpl
 */

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired CustomerMapper customerMapper;

    @Override
    public void addCustomer(CustomerDTO customer) {
        customerMapper.insertCustomer(customer);
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

    @Override
    public int countAll() {
        return customerMapper.selectCount();
    }

    @Override
    public CustomerDTO login(CustomerDTO customer) {
        System.out.println("컨트롤러에서 넘어온 id : "+customer.getCustomerId());
        System.out.println("컨트롤러에서 넘어온 pass : "+customer.getPassword());

        return customerMapper.login(customer);
    }

}