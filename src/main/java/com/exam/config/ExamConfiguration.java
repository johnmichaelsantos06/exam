package com.exam.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.exam.graphql.api.SkuTestProductGraphqlApi;

import graphql.schema.GraphQLSchema;
import io.leangen.graphql.GraphQLSchemaGenerator;

@Configuration
public class ExamConfiguration {
	
	@Autowired
	private SkuTestProductGraphqlApi skuTestProductGraphqlApi;
	
	@Bean
    public GraphQLSchema graphQLSchema(GraphQLSchemaGenerator schemaGenerator) {
        return schemaGenerator
        		.withOperationsFromSingleton(skuTestProductGraphqlApi, SkuTestProductGraphqlApi.class)
        		.generate();
    }
}
