package com.example.EcommerceSpringBoot.configuration;

import com.example.EcommerceSpringBoot.gateways.api.FakeStoreCategoryAPI;
import com.example.EcommerceSpringBoot.gateways.api.FakeStoreProductAPI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfig {
    @Value("${fakestore.api.url}")
    private String BASE_URL;
   @Bean
    public Retrofit retrofit(){
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Bean
    public FakeStoreCategoryAPI fakeStoreCategoryAPI(Retrofit retrofit){
       return retrofit.create(FakeStoreCategoryAPI.class);
    }

    @Bean
    public FakeStoreProductAPI fakeStoreProductAPI(Retrofit retrofit){
       return retrofit.create(FakeStoreProductAPI.class);
    }
}
