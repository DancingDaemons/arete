package com.exemplar.arete.web.goal;

import com.exemplar.arete.domain.goal.Goal;
import com.exemplar.arete.web.goal.ports.GoalDomainPorts;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@AllArgsConstructor
@RequestMapping("/goal")
public class GoalController {

    private final GoalDomainPorts goalDomainPorts;

    @GetMapping("")
    public List<Goal> getAllGoals(@RequestBody String username) {return goalDomainPorts.getGoalsByUser(username);}

    @PostMapping()
    public void createNewGoal(@RequestBody Goal goal) {
        goalDomainPorts.createGoal(goal);
    }
}
