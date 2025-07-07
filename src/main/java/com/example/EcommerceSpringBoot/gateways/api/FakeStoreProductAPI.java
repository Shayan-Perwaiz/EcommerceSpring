package com.example.EcommerceSpringBoot.gateways.api;

import com.example.EcommerceSpringBoot.dto.FakeStoreProductDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.io.IOException;

public interface FakeStoreProductAPI {
    @GET("products/{id}")
    Call<FakeStoreProductDTO>getFakeProductById(@Path("id") Long id) throws IOException;
}
