package com.example.EcommerceSpringBoot.controllers;

import com.example.EcommerceSpringBoot.dto.CategoryDTO;
import com.example.EcommerceSpringBoot.services.ICategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    private ICategoryService categoryService;

    public CategoryController(ICategoryService _categoryService){
        this.categoryService = _categoryService;
    }

    @GetMapping
    public List<CategoryDTO> getAllCategories() throws IOException {
        return this.categoryService.getAllCategories();
//        List<CategoryDTO> result = this.categoryService.getAllCategories();
//        return ResponseEntity.ok(result);
    }

}
