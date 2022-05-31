package com.exam.skutestproduct.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.exam.skutestproduct.response.SkuTestProductResponse;
import com.exam.skutestproduct.service.SkuTestProductService;

@Service
public class SkuTestProductServiceImpl implements SkuTestProductService {

	@Value("${sku.testproduct.url}")
	private String url;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public SkuTestProductResponse getProductDetails() {
		ResponseEntity<SkuTestProductResponse> response = restTemplate.exchange(url, HttpMethod.GET, null, SkuTestProductResponse.class);
		if (response == null || response.getBody() == null) {
			return new SkuTestProductResponse();
		}
		return response.getBody();
	}

}
