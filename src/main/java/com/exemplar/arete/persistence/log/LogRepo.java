package com.exemplar.arete.persistence.log;

import com.exemplar.arete.domain.log.Log;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface LogRepo extends MongoRepository<LogEntity, String> {

    List<LogEntity> findAllByGoalId(String goalId);
    LogEntity save(LogEntity logEntity);
    Optional<LogEntity> findByDateAndGoalId(LocalDate date, String goalId);
    List<LogEntity> findAllByDateBeforeAndGoalId(@Param("date") LocalDate date, String goalId);

}
