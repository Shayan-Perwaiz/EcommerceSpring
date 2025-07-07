package com.example.EcommerceSpringBoot.controllers;

import com.example.EcommerceSpringBoot.dto.ProductDTO;
import com.example.EcommerceSpringBoot.services.FakeStoreProductService;
import com.example.EcommerceSpringBoot.services.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final IProductService iProductService;

    public ProductController(IProductService iProductService){
        this.iProductService = iProductService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductByIdController(@PathVariable("id") Long id) throws IOException {
        ProductDTO response = this.iProductService.getProductById(id);
        return ResponseEntity.ok(response);
    }
}
