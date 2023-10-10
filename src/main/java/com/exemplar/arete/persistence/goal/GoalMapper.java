package com.exemplar.arete.persistence.goal;

import com.exemplar.arete.domain.goal.Goal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface GoalMapper {

    @Mapping(target = "id", ignore = true)
    GoalEntity modelToEntity(Goal goal);

    Goal entityToModel(GoalEntity goalEntity);
}
