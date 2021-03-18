package com.springelastic.demo1.configuration;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.springelastic.demo1.repositories.playerRepository;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.search.aggregations.bucket.terms.ParsedStringTerms;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.client.reactive.ReactiveElasticsearchClient;
import org.springframework.data.elasticsearch.client.reactive.ReactiveRestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.config.AbstractReactiveElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableReactiveElasticsearchRepositories;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@Configuration
@EnableReactiveElasticsearchRepositories(basePackageClasses = playerRepository.class)
public class playerconfig extends AbstractElasticsearchConfiguration {

    @Override
    public RestHighLevelClient elasticsearchClient()
    {
        final ClientConfiguration clientConfiguration = ClientConfiguration.builder().
                connectedTo("localhost:9200").build();
        return RestClients.create(clientConfiguration).rest();
    }

}
