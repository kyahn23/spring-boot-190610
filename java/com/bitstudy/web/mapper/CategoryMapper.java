package com.bitstudy.web.mapper;

import java.util.List;

import com.bitstudy.web.domain.CategoryDTO;

import org.springframework.stereotype.Repository;

/**
 * CategoryMapper
 */
@Repository
public interface CategoryMapper {
    // C
    public void insertCategory(CategoryDTO category);
    // R
    public List<CategoryDTO> selectCategories();
    public List<CategoryDTO> selectCategoriesByOption(CategoryDTO category);
    public CategoryDTO selectCategoryByCategoryId(String category);
    // U
    public void updateCategory(CategoryDTO category);
    // D
    public void deleteCategory(CategoryDTO category);

}