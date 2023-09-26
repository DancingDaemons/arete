package com.exemplar.arete.web.log;

import com.exemplar.arete.domain.log.Log;
import com.exemplar.arete.web.log.dto.AddLog;
import com.exemplar.arete.web.log.ports.LogDomainPorts;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@AllArgsConstructor
@RestController
@RequestMapping("/log")
public class LogController {

    private final LogDomainPorts logDomainPorts;

    @GetMapping("/{goalId}")
    public List<Log> getDayLogById(@PathVariable String goalId){
        return logDomainPorts.getLogsByGoalId(goalId);
    }

    @PostMapping("")
    public Log addLog(@RequestBody AddLog addLog){
        return logDomainPorts.addLog(addLog);
    }

}
