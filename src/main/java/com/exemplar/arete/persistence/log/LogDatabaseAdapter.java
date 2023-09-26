package com.exemplar.arete.persistence.log;

import com.exemplar.arete.domain.log.Log;
import com.exemplar.arete.domain.log.ports.LogDatabasePorts;

import java.util.List;

public class LogDatabaseAdapter implements LogDatabasePorts {
    @Override
    public List<Log> getLogsByGoal(String goalId) {
        return null;
    }
}
