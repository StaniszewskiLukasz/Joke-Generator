package com.joke.api.jokesender.repositories;

import com.joke.api.jokesender.dao.RankModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RankRepository extends MongoRepository<RankModel, String> {
}
