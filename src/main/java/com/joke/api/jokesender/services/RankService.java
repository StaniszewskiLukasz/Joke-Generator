package com.joke.api.jokesender.services;

import com.joke.api.jokesender.dto.RankDto;
import com.joke.api.jokesender.repositories.JokeRepository;
import com.joke.api.jokesender.repositories.RankRepository;
import org.springframework.stereotype.Service;

@Service
public class RankService {

    private final RankRepository rankRepository;
    private final JokeRepository jokeRepository;

    public RankService(RankRepository rankRepository, JokeRepository jokeRepository) {
        this.rankRepository = rankRepository;
        this.jokeRepository = jokeRepository;
    }


    public RankDto save(RankDto rankDto) {
        return null;
    }
}
