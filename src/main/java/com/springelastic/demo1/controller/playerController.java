package com.springelastic.demo1.controller;


import com.springelastic.demo1.entity.player;
import com.springelastic.demo1.repositories.playerRepository;
import com.springelastic.demo1.service.playerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

// This is restcontroller for the playerdata

@RestController
@RequestMapping("/player")
public class playerController {

    @Autowired
    playerService playerRepo;

    @GetMapping("/all")
    public Iterable<player> getAll(){
        return playerRepo.findAll();
    }
    //to find list of player by their type ie.batsman, bowler , wk
    @GetMapping("/type/{text}")
    public SearchHits<player> findSearchByType(@PathVariable(value = "text") String text){
        return playerRepo.findBytype(text);
    }
    //find player by first name
    @GetMapping("/firstname/{text}")
    public SearchHits<player> findByFirstName(@PathVariable(value = "text") String text){
        return playerRepo.findByfirstName(text);
    }
    @GetMapping("/lastname/{text}")
    public SearchHits<player> findByLastName(@PathVariable(value = "text") String text){
        return playerRepo.findBylastName(text);
    }
    // finding top 3 batsmen based on total number of runs scored
    @GetMapping("/top3batsman")
    public SearchHits<player> Top3batsman(@PathVariable(value = "text") String text){
        return playerRepo.top3batsman(text);
    }
    @GetMapping("/top3bolwer")
    public SearchHits<player> Top3bowler(@PathVariable(value = "text") String text){
        return playerRepo.top3bowler(text);
    }
    //addnewplayer
    @PostMapping("/addplayer")
    public void addPlayer(@RequestBody player p1){
        playerRepo.addPlayer(p1);
    }
}
