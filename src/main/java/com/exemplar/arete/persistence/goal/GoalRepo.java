package com.exemplar.arete.persistence.goal;

import com.exemplar.arete.domain.goal.Goal;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface GoalRepo  extends MongoRepository<GoalEntity,String> {
    List<GoalEntity> findAllByUserId(String userId);

}
