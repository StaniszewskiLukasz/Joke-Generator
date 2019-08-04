package com.joke.api.jokesender.collector;

import com.joke.api.jokesender.dto.JokeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JokesCollector {


    RestTemplate restTemplate = new RestTemplate();

    @Scheduled(cron = "* * * * * *")
    public void saveJokeFromChuckApi() {
        ResponseEntity<JokeDto> entity = restTemplate.getForEntity("http://api.icndb.com/jokes/random", JokeDto.class);


    }

}
