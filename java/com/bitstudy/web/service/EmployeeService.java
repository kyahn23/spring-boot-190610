package com.bitstudy.web.service;

import java.util.List;

import com.bitstudy.web.domain.EmployeeDTO;

import org.springframework.stereotype.Component;

/**
 * EmployeeService
 */

@Component
public interface EmployeeService {
    // C
    public void addEmployee(EmployeeDTO employee);
    // R
    public List<EmployeeDTO> findEmployee();
    public List<EmployeeDTO> findEmployeesByOption(EmployeeDTO employee);
    public EmployeeDTO findEmployeeByEmployeeId(String employeeId);
    // U
    public void updateEmployee(EmployeeDTO employee);
    // D
    public void deleteEmployee(EmployeeDTO employee);
    
}