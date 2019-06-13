package com.bitstudy.web.mapper;

import java.util.List;

import com.bitstudy.web.domain.EmployeeDTO;

import org.springframework.stereotype.Repository;

/**
 * EmployeeMapper
 */

@Repository
public interface EmployeeMapper {
// C
public void insertEmployee(EmployeeDTO Employee);
// R
public List<EmployeeDTO> selectEmployees();
public List<EmployeeDTO> selectEmployeesByOption(EmployeeDTO employee);
public EmployeeDTO selectEmployeeByEmployeeId(String employeeId);
// U
public void updateEmployee(EmployeeDTO Employee);
// D
public void deleteEmployee(EmployeeDTO Employee);
    
}