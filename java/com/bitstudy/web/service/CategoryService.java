package com.bitstudy.web.service;

import java.util.List;

import com.bitstudy.web.domain.CategoryDTO;

import org.springframework.stereotype.Component;

/**
 * CategoryService
 */
@Component
public interface CategoryService {
    // C
    public void addCategory(CategoryDTO category);
    // R
    public List<CategoryDTO> findCategories();
    public List<CategoryDTO> findCategoriesByOption(CategoryDTO category);
    public CategoryDTO findCategoryByCategoryId(String category);
    // U
    public void updateCategory(CategoryDTO category);
    // D
    public void deleteCategory(CategoryDTO category);

    
}