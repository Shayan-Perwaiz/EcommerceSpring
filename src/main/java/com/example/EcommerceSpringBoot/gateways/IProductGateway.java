package com.example.EcommerceSpringBoot.gateways;

import com.example.EcommerceSpringBoot.dto.ProductDTO;

import java.io.IOException;

public interface IProductGateway {
    ProductDTO getProductByIdGateway(int id) throws IOException;
}
