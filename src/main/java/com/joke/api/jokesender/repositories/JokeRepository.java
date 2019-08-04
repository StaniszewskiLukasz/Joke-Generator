package com.joke.api.jokesender.repositories;

import com.joke.api.jokesender.dao.JokeModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JokeRepository extends MongoRepository<JokeModel, String> {
}
