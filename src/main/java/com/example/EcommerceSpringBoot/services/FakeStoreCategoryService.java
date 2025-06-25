package com.example.EcommerceSpringBoot.services;

import com.example.EcommerceSpringBoot.gateways.ICategoryGateway;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FakeStoreCategoryService implements ICategoryService{
    private final ICategoryGateway categoryGateway;

    public FakeStoreCategoryService(ICategoryGateway categoryGateway){
        this.categoryGateway = categoryGateway;
    }
    @Override
    public List<String> getAllCategories() {
        return List.of();
    }
}
