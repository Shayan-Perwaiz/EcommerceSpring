package com.example.EcommerceSpringBoot.services;

import com.example.EcommerceSpringBoot.dto.ProductDTO;
import com.example.EcommerceSpringBoot.gateways.IProductGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class FakeStoreProductService implements IProductService{
    private final IProductGateway productGateway;

    public FakeStoreProductService(IProductGateway productGateway){
        this.productGateway = productGateway;
    }
    @Override
    public ProductDTO getProductById(int id ) throws IOException {
        return this.productGateway.getProductByIdGateway(id);
    }
}
