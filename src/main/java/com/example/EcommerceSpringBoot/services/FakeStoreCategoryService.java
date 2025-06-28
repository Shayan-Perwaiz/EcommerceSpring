package com.example.EcommerceSpringBoot.services;

import com.example.EcommerceSpringBoot.dto.CategoryDTO;
import com.example.EcommerceSpringBoot.gateways.ICategoryGateway;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakeStoreCategoryService implements ICategoryService{
    private final ICategoryGateway categoryGateway;

    public FakeStoreCategoryService(ICategoryGateway categoryGateway){
        this.categoryGateway = categoryGateway;
    }
    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        return this.categoryGateway.getAllCategoriesGateway();

    }
}
