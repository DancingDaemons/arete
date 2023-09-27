package com.exemplar.arete.persistence.goal;

import com.exemplar.arete.domain.goal.Goal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface GoalMapper {

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "userId", source = "userId"),
            @Mapping(target = "goalName", source = "goalName"),
            @Mapping(target = "category", source = "category"),
            @Mapping(target = "quantitativeType", source = "quantitativeType"),
            @Mapping(target = "goalTarget", source = "goalTarget"),
            @Mapping(target = "logIds", source = "logIds")
    })    GoalEntity modelToEntity(Goal goal);


    @Mappings({
            @Mapping(target = "id", source = "id"),
            @Mapping(target = "userId", source = "userId"),
            @Mapping(target = "goalName", source = "goalName"),
            @Mapping(target = "category", source = "category"),
            @Mapping(target = "quantitativeType", source = "quantitativeType"),
            @Mapping(target = "goalTarget", source = "goalTarget"),
            @Mapping(target = "logIds", source = "logIds")
    })
    Goal entityToModel(GoalEntity goalEntity);
}
