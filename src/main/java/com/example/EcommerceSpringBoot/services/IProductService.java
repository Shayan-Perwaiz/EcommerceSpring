package com.example.EcommerceSpringBoot.services;

import com.example.EcommerceSpringBoot.dto.ProductDTO;

import java.io.IOException;

public interface IProductService {
    public ProductDTO getProductById(int id) throws IOException;
}
