package com.bitstudy.web.domain;

import lombok.Data;

/**
 * EmployeeDTO
 */
@Data
public class EmployeeDTO {

    private String employeeId, manager, name, birthDate, photo, notes;

}