package com.example.EcommerceSpringBoot.gateways;

import com.example.EcommerceSpringBoot.dto.CategoryDTO;
import org.springframework.stereotype.Component;

@Component
public class FakeStoreICategoryGateway implements ICategoryGateway {
    @Override
    public CategoryDTO getAllCategory() {
        return null;
    }
}
