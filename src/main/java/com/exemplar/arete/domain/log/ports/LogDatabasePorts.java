package com.exemplar.arete.domain.log.ports;

import com.exemplar.arete.domain.log.Log;
import com.exemplar.arete.web.log.dto.AddLog;

import java.util.List;

public interface LogDatabasePorts {
    List<Log> getLogsByGoal(String goalId);
    Log addLog(AddLog addLog);
}
