package com.bitstudy.web.serviceImpl;

import java.util.List;

import com.bitstudy.web.domain.EmployeeDTO;
import com.bitstudy.web.service.EmployeeService;

import org.springframework.stereotype.Service;

/**
 * EmployeeServiceImpl
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public void addEmployee(EmployeeDTO employee) {

    }

    @Override
    public List<EmployeeDTO> findEmployee() {
        return null;
    }

    @Override
    public List<EmployeeDTO> findEmployeesByOption(EmployeeDTO employee) {
        return null;
    }

    @Override
    public EmployeeDTO findEmployeeByEmployeeId(String employeeId) {
        return null;
    }

    @Override
    public void updateEmployee(EmployeeDTO employee) {

    }

    @Override
    public void deleteEmployee(EmployeeDTO employee) {

    }

    

}