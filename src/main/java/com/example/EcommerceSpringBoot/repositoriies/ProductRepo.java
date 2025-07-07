package com.example.EcommerceSpringBoot.repositoriies;

import com.example.EcommerceSpringBoot.Entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductEntity, Long> {
}
