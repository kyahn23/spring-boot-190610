package com.bitstudy.web.service;

import java.util.List;

import com.bitstudy.web.domain.ProductDTO;

import org.springframework.stereotype.Component;

/**
 * ProductService
 */

@Component
public interface ProductService {
    // C
    public void addProduct(ProductDTO product);
    // R
    public List<ProductDTO> findProducts();
    public List<ProductDTO> findProductsByOption(ProductDTO product);
    public ProductDTO findProductByProductId(String productId);
    // U
    public void updateProduct(ProductDTO product);
    // D
    public void deleteProduct(ProductDTO product);
}