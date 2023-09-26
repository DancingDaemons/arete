package com.exemplar.arete.domain.goal;

import com.exemplar.arete.domain.goal.ports.GoalDatabasePorts;
import com.exemplar.arete.domain.users.UserService;
import com.exemplar.arete.web.goal.ports.GoalDomainPorts;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GoalService implements GoalDomainPorts {
    private final GoalDatabasePorts goalDatabasePorts;
    private final UserService userService;
    @Override
    public List<Goal> getGoalsByUser(String username) {
        return goalDatabasePorts.getGoalsByUser(userService.getCurrentUser());
    }

    @Override
    public void createGoal(Goal goal) {

    }
}
