package com.exemplar.arete.persistence.log;

import com.exemplar.arete.domain.log.Log;
import com.exemplar.arete.domain.log.ports.LogDatabasePorts;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class LogDatabaseAdapter implements LogDatabasePorts {
    private final LogMapper logMapper;
    private final LogRepo logRepo;
    @Override
    public List<Log> getLogsByGoal(String goalId) {
        List<LogEntity> logEntities = logRepo.findAllByGoalId(goalId);
        return logEntities.stream().map(logMapper::entityToModel).toList();
    }

    @Override
    public Log addLog(Log log) {
        LogEntity logEntity = logMapper.modelToEntity(log);
        LogEntity result = logRepo.save(logEntity);
        return logMapper.entityToModel(result);
    }
}
