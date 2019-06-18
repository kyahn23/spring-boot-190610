package com.bitstudy.web.controller;

import java.util.HashMap;

import com.bitstudy.web.domain.CustomerDTO;
import com.bitstudy.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CustomerController
 */

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired CustomerService customerService;
    @Autowired CustomerDTO customer;

    @RequestMapping("/count")
    public String count() {
        System.out.println("CustomerController count() 경로로 들어옴");
        int count = customerService.countAll();
        System.out.println("고객의 총 인원 : " + count);
        return count + "";
    }

    @GetMapping("/{customerId}/{password}")
    public CustomerDTO login(@PathVariable("customerId") String id,
                                @PathVariable("password") String pass){
        customer.setCustomerId(id);
        customer.setPassword(pass);

        return customerService.login(customer);
    }

    @PostMapping("")
    public HashMap<String,Object> join(@RequestBody CustomerDTO param){
        System.out.println("====post mapping====");
        System.out.println(param.getCustomerId());
        System.out.println(param.getPassword());
        System.out.println(param.getCustomerName());
        customerService.addCustomer(param);
        HashMap<String,Object> map = new HashMap<>();
        map.put("result", "SUCCESS");

        return map;
    }

}