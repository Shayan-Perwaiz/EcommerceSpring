package com.example.EcommerceSpringBoot.services;

import com.example.EcommerceSpringBoot.Entity.ProductEntity;
import com.example.EcommerceSpringBoot.dto.ProductDTO;
import com.example.EcommerceSpringBoot.mapper.ProductMapper;
import com.example.EcommerceSpringBoot.repositoriies.ProductRepo;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ProductService implements IProductService{
    private final ProductRepo productRepo;

    ProductService(ProductRepo productRepo){
        this.productRepo = productRepo;
    }

    @Override
    public ProductDTO getProductById(Long id) throws IOException {
        ProductEntity product = productRepo.findById(id)
                .orElseThrow(() -> new IOException("Product not found"));
        return ProductMapper.toProductDto(product);

    }

    @Override
    public String createProduct(ProductDTO productDTO) {
        ProductEntity product = ProductMapper.toProductEntity(productDTO);
        productRepo.save(product);
        return "Product has been created";
    }
}
