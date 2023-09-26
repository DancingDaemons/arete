package com.exemplar.arete.persistence.goal;

import com.exemplar.arete.domain.goal.Goal;
import com.exemplar.arete.domain.goal.ports.GoalDatabasePorts;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class GoalDatabaseAdapter implements GoalDatabasePorts {
    private final GoalMapper goalMapper;
    private final GoalRepo goalRepo;

    @Override
    public List<Goal> getGoalsByUser(String userId) {
        List<GoalEntity> goalEntities = goalRepo.findAllByUserId(userId);
        return goalEntities.stream().map(goalMapper::entityToModel).collect(Collectors.toList());
    }
}
