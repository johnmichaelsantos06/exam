package com.exam.graphql.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.skutestproduct.response.SkuTestProductResponse;
import com.exam.skutestproduct.service.SkuTestProductService;

import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;

@GraphQLApi
@Service
public class SkuTestProductGraphqlApi {

	@Autowired
	private SkuTestProductService service;
	
	@GraphQLQuery
	public SkuTestProductResponse getProductDetails() {
		return service.getProductDetails();
	}
	
}
