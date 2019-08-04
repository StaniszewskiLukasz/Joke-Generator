package com.joke.api.jokesender.mapper;

import com.joke.api.jokesender.dao.JokeModel;
import com.joke.api.jokesender.dto.JokeDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface JokesMapper {

   JokesMapper INSTANCE = Mappers.getMapper(JokesMapper.class);

    @Mappings({
            @Mapping(source = "value.id", target = "externalId"),
            @Mapping(source = "value.joke", target = "value"),
            @Mapping(source = "value.categories", target = "categories")
    })
    JokeModel jokeDtoToJokeEntity(JokeDto joke);

    @Mappings({
            @Mapping(source = "externalId", target = "value.id"),
            @Mapping(source = "value", target = "value.joke"),
            @Mapping(source = "categories", target = "value.categories")
    })
    JokeDto jokeEntityToJokeDto(JokeModel entity);
}
