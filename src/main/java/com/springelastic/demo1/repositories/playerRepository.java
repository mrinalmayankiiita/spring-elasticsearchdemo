package com.springelastic.demo1.repositories;

import com.springelastic.demo1.entity.player;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface playerRepository extends ElasticsearchRepository<player , Integer>{

    SearchHits<player> findByfirstName(String text);

    SearchHits<player> findBylastName(String text);

    SearchHits<player> findBytype(String text);
}
