package com.example.EcommerceSpringBoot.gateways;

import com.example.EcommerceSpringBoot.dto.FakeStoreProductDTO;
import com.example.EcommerceSpringBoot.dto.ProductDTO;
import com.example.EcommerceSpringBoot.gateways.api.FakeStoreProductAPI;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class FakeStoreProductGateway implements IProductGateway {
    private final FakeStoreProductAPI fakeStoreProductAPI;

    public FakeStoreProductGateway(FakeStoreProductAPI fakeStoreProductAPI) {
        this.fakeStoreProductAPI = fakeStoreProductAPI;
    }
    @Override
    public ProductDTO getProductByIdGateway(int id) throws IOException {
        FakeStoreProductDTO response = this.fakeStoreProductAPI.getFakeProductById(id).execute().body();
        if(response == null) {
            throw new IOException("Failed to fetch a product from an Fakestore API");
        }
        return response.getProduct();
    }
}
