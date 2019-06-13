package com.bitstudy.web.mapper;

import java.util.List;

import com.bitstudy.web.domain.ProductDTO;

import org.springframework.stereotype.Repository;

/**
 * ProductMapper
 */

@Repository
public interface ProductMapper {
    // C
    public void insertProduct(ProductDTO product);

    // R
    public List<ProductDTO> selectProducts();

    public List<ProductDTO> selectProductsByOption(ProductDTO product);

    public ProductDTO selectProductByProductId(String productId);

    // U
    public void updateProduct(ProductDTO product);

    // D
    public void deleteProduct(ProductDTO product);

}