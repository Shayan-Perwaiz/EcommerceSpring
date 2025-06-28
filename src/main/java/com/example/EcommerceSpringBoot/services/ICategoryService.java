package com.example.EcommerceSpringBoot.services;

import com.example.EcommerceSpringBoot.dto.CategoryDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryService {
    public List<CategoryDTO> getAllCategories() throws IOException;
}
