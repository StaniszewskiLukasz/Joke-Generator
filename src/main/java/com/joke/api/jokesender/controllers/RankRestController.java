package com.joke.api.jokesender.controllers;

import com.joke.api.jokesender.dto.RankDto;
import com.joke.api.jokesender.services.RankService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class RankRestController {

    private final RankService rankService;

    public RankRestController(RankService rankService) {
        this.rankService = rankService;
    }

    @PostMapping("/rank")
    public void sendRank(@RequestBody RankDto rankDto){
      RankDto rankDtoSaved = rankService.save(rankDto);
      log.info("rank: " + rankDtoSaved.toString() + " has been send") ;
    }


}
