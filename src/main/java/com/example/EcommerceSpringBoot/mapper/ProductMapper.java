package com.example.EcommerceSpringBoot.mapper;

import com.example.EcommerceSpringBoot.Entity.ProductEntity;
import com.example.EcommerceSpringBoot.dto.ProductDTO;

public class ProductMapper {
    public static ProductDTO toProductDto(ProductEntity product){
        return ProductDTO.builder()
                .id(product.getId())
                .brand(product.getBrand())
                .image(product.getImage())
                .color(product.getColor())
                .model(product.getModel())
                .price(product.getPrice())
                .title(product.getTitle())
                .category(product.getCategory())
                .description(product.getDescription())
                .popular(product.isPopular())
                .discount(product.getDiscount())
                .build();
    }

    public static ProductEntity toProductEntity(ProductDTO product){
        return ProductEntity.builder()
                .brand(product.getBrand())
                .image(product.getImage())
                .color(product.getColor())
                .model(product.getModel())
                .price(product.getPrice())
                .title(product.getTitle())
                .category(product.getCategory())
                .description(product.getDescription())
                .popular(product.isPopular())
                .discount(product.getDiscount())
                .build();
    }
}
