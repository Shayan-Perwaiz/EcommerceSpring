package com.example.EcommerceSpringBoot.gateways;

import com.example.EcommerceSpringBoot.dto.CategoryDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryGateway {
    public List<CategoryDTO> getAllCategoriesGateway() throws IOException;
}
