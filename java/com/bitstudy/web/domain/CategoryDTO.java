package com.bitstudy.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * CategoryDTO
 */

@Data @Component @Lazy
public class CategoryDTO {

    private String categoryId, categoryName, description;
}