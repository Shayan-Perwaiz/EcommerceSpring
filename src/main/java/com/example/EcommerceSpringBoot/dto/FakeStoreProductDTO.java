package com.example.EcommerceSpringBoot.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FakeStoreProductDTO{
	private String message;
	private String status;
	private ProductDTO product;

}