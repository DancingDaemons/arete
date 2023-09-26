package com.exemplar.arete.web.log.ports;

import com.exemplar.arete.domain.log.Log;
import com.exemplar.arete.web.log.dto.AddLog;

import java.util.List;

public interface LogDomainPorts {
     Log addLog(AddLog addLog);
     List<Log> getLogsByGoalId(String goalId);
}
