package com.springelastic.demo1.loaders;

import com.springelastic.demo1.entity.player;
import com.springelastic.demo1.repositories.playerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;

// load some pre-data while starting the server
import javax.annotation.PostConstruct;

public class playerLoader {
    @Autowired
    ElasticsearchOperations elasticsearchOperations;
    @Autowired
    playerRepository playerRepo;

    @PostConstruct
    public void loadAll(){
        playerRepo.save(new player(1,"Virat","Kohli","Batsman",32,10001,52,3,0,170));
        playerRepo.save(new player(2,"MS","Dhoni","Wicket-keeper-Batsman",36,107301,52,3,0,170));
        playerRepo.save(new player(3,"KL","Rahul","Batsman",32,10001,52,3,0,170));
        playerRepo.save(new player(4,"jaspreet","Bumrah","bowler",22,100,52,100,0,170));
        playerRepo.save(new player(5,"Virat","Kohli","Batsman",32,10001,52,3,0,170));
        playerRepo.save(new player(6,"Virat","Kohli","Batsman",32,10001,52,3,0,170));

    }

}
