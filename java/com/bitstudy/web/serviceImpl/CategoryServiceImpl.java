package com.bitstudy.web.serviceImpl;

import java.util.List;

import com.bitstudy.web.domain.CategoryDTO;
import com.bitstudy.web.service.CategoryService;

import org.springframework.stereotype.Service;

/**
 * CategoryServiceImpl
 */

@Service
public class CategoryServiceImpl implements CategoryService {

    @Override
    public void addCategory(CategoryDTO category) {

    }

    @Override
    public List<CategoryDTO> findCategories() {
        return null;
    }

    @Override
    public List<CategoryDTO> findCategoriesByOption(CategoryDTO category) {
        return null;
    }

    @Override
    public CategoryDTO findCategoryByCategoryId(String category) {
        return null;
    }

    @Override
    public void updateCategory(CategoryDTO category) {

    }

    @Override
    public void deleteCategory(CategoryDTO category) {

    }

    

}