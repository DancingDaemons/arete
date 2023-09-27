package com.exemplar.arete.persistence.log;

import com.exemplar.arete.domain.log.Log;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface LogMapper {
    @Mappings({
            @Mapping(target = "id", ignore = true), // Ignore _id when mapping from AddLog to LogEntity
            @Mapping(target = "date", source = "date"),
            @Mapping(target = "complete", source = "complete"),
            @Mapping(target = "goalId", source = "goalId"),
            @Mapping(target = "note", source = "note")
    })
    LogEntity modelToEntity(Log addLog);

    @Mappings({
            @Mapping(target = "id", source = "id"),
            @Mapping(target = "date", source = "date"),
            @Mapping(target = "complete", source = "complete"),
            @Mapping(target = "goalId", source = "goalId"),
            @Mapping(target = "note", source = "note")
    })
    Log entityToModel(LogEntity logEntity);
}

