package com.exemplar.arete.persistence.log;

import com.exemplar.arete.domain.log.Log;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface LogMapper {

    @Mapping(target = "id", ignore = true) // Ignore _id when mapping from AddLog to LogEntity
    LogEntity modelToEntity(Log addLog);

    @Mapping(target = "id", source = "id")
    Log entityToModel(LogEntity logEntity);
}

