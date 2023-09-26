package com.exemplar.arete.domain.goal.ports;

import com.exemplar.arete.domain.goal.Goal;

import java.util.List;

public interface GoalDatabasePorts {
    List<Goal> getGoalsByUser(String userId);
}
