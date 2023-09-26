package com.exemplar.arete.domain.log;

import com.exemplar.arete.domain.log.ports.LogDatabasePorts;
import com.exemplar.arete.web.log.dto.AddLog;
import com.exemplar.arete.web.log.ports.LogDomainPorts;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LogService implements LogDomainPorts {
    private final LogDatabasePorts logDatabasePorts;
    @Override
    public Log addLog(AddLog addLog) {
        return logDatabasePorts.addLog(addLog);
    }

    @Override
    public List<Log> getLogsByGoalId(String goalId) {
        return logDatabasePorts.getLogsByGoal(goalId);
    }
}
