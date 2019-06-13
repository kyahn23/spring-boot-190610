package com.bitstudy.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * ProductDTO
 */

@Data @Component @Lazy
public class ProductDTO {

    private String productId, productName, supplierId, categoryId, unit, price, photo;

}