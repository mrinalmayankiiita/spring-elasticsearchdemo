package com.springelastic.demo1.service;

import com.springelastic.demo1.entity.player;
import com.springelastic.demo1.repositories.playerDAO;
import com.springelastic.demo1.repositories.playerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.stereotype.Service;


//service layer

@Service
public class playerService {
    @Autowired
    playerRepository playerRepo;
    @Autowired
    playerDAO pdo;
    public Iterable<player> findAll() {
        return playerRepo.findAll();
    }

    public SearchHits<player> findByfirstName(String text) {
        return playerRepo.findByfirstName(text);
    }

    public SearchHits<player> findBylastName(String text) {
        return playerRepo.findBylastName(text);
    }

    public SearchHits<player> findBytype(String text) {
        return playerRepo.findBytype(text);
    }

    public SearchHits<player> top3batsman(String text){
        //System.out.println("i amhera");
        return pdo.top3batsman(text);
    }

    public SearchHits<player> top3bowler(String text){
        //System.out.println("i amhera");
        return pdo.top3bowler(text);
    }

    public void addPlayer(player p1) {
            playerRepo.save(p1);
    }
}
