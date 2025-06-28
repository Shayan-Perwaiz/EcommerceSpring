package com.example.EcommerceSpringBoot.gateways;

import com.example.EcommerceSpringBoot.dto.CategoryDTO;
import com.example.EcommerceSpringBoot.dto.FakeStoreCategoryResponseDTO;
import com.example.EcommerceSpringBoot.gateways.api.FakeStoreCategoryAPI;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreCategoryGateway implements ICategoryGateway {
    private final FakeStoreCategoryAPI fakeStoreCategoryAPI;

    public FakeStoreCategoryGateway(FakeStoreCategoryAPI fakeStoreCategoryAPI){
        this.fakeStoreCategoryAPI = fakeStoreCategoryAPI;
    }
    @Override
    public List<CategoryDTO> getAllCategoriesGateway() throws IOException {
        FakeStoreCategoryResponseDTO response = this.fakeStoreCategoryAPI.getAllFakeCategories().execute().body();
        if(response == null){
            throw new IOException("Failed to fetch categories from an Fakestore API");
        }

        return response.getCategories().stream()
                .map(category -> CategoryDTO.builder()
                        .name(category)
                        .build())
                .toList();

    }
}
