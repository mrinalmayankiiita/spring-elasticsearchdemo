package com.springelastic.demo1.repositories;

import com.springelastic.demo1.entity.player;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.query.Criteria;
import org.springframework.data.elasticsearch.core.query.CriteriaQuery;
import org.springframework.data.elasticsearch.core.query.Query;
import org.springframework.stereotype.Component;

@Component
public class playerDAO {
    @Autowired
    private ElasticsearchOperations elasticsearchOperations;
    @Autowired
    RestHighLevelClient restHighLevelClient;

    public SearchHits<player> top3batsman(String text){
        //System.out.println("i cam here");
        Criteria criteria = new Criteria("type").is(text);
        Query q1 = new CriteriaQuery(criteria).addSort(Sort.by("totalRuns").descending());
        return elasticsearchOperations.search(q1,player.class);
    }
    public SearchHits<player> top3bowler(String text){
        //System.out.println("i cam here");
        Criteria criteria = new Criteria("type").is(text);
        Query q1 = new CriteriaQuery(criteria).addSort(Sort.by("totalWickets").descending());
        return elasticsearchOperations.search(q1,player.class);
    }
}
