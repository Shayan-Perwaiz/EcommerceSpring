package com.example.EcommerceSpringBoot.mapper;

import com.example.EcommerceSpringBoot.dto.CategoryDTO;
import com.example.EcommerceSpringBoot.dto.FakeStoreCategoryResponseDTO;

import java.util.List;

public class GetAllCategoriesMapper {

//    public static FakeStoreCategoryResponseDTO fakeStoreCategoryResponseDTO(){
//        return null;
//    }

    public static List<CategoryDTO> toCategoryDTOList(FakeStoreCategoryResponseDTO dto){
        return dto.getCategories().stream()
                .map(category -> CategoryDTO.builder()
                        .name(category).
                        build())
                .toList();
    }
}
