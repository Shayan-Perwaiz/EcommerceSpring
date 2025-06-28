package com.example.EcommerceSpringBoot.gateways.api;

import com.example.EcommerceSpringBoot.dto.FakeStoreCategoryResponseDTO;
import retrofit2.Call;
import retrofit2.http.GET;

import java.io.IOException;


public interface FakeStoreCategoryAPI {
    @GET("products/category")
    Call<FakeStoreCategoryResponseDTO> getAllFakeCategories() throws IOException;
}
