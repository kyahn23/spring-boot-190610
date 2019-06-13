package com.bitstudy.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * EmployeeDTO
 */

@Data @Component @Lazy
public class EmployeeDTO {

    private String employeeId, manager, name, birthDate, photo, notes;

}