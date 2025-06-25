package com.example.EcommerceSpringBoot.controllers;

import com.example.EcommerceSpringBoot.services.ICategoryService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    private ICategoryService categoryService;

    public CategoryController(ICategoryService _categoryService){
        this.categoryService = _categoryService;
    }
    public List<String> getAllCategories(){
        return this.categoryService.getAllCategories();
    }

}
