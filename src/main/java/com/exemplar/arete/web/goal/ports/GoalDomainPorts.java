package com.exemplar.arete.web.goal.ports;

import com.exemplar.arete.domain.goal.Goal;

import java.util.List;

public interface GoalDomainPorts {
    List<Goal> getGoalsByUser(String username);
    void createGoal(Goal goal);
}
