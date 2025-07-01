package com.example.EcommerceSpringBoot.gateways;

import com.example.EcommerceSpringBoot.dto.CategoryDTO;
import com.example.EcommerceSpringBoot.dto.FakeStoreCategoryResponseDTO;
import com.example.EcommerceSpringBoot.mapper.GetAllCategoriesMapper;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Primary;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

@Component
@Primary
public class FakeStoreRestTempelateGateway implements ICategoryGateway{
    private final RestTemplateBuilder restTemplateBuilder;

    public FakeStoreRestTempelateGateway(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }
    public List<CategoryDTO> getAllCategoriesGateway() throws IOException {
        RestTemplate restTemplate = restTemplateBuilder.build();
        String url = "https://fakestoreapi.in/api/products/category";
        ResponseEntity<FakeStoreCategoryResponseDTO> response = restTemplate.getForEntity(url, FakeStoreCategoryResponseDTO.class);
        if(response.getBody() == null){
            throw new IOException("Failed to fetch categories from an Fakestore API");
        }
        return GetAllCategoriesMapper.toCategoryDTOList(response.getBody());
    }

}
