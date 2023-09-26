package com.exemplar.arete.persistence.log;

import com.exemplar.arete.web.log.dto.AddLog;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "logs")
public class LogEntity {

    @Id
    private ObjectId id;
    @JsonFormat(pattern = "yyyy-MM-dd")
    public LocalDate date;
    public boolean complete;
    public String realized;

    public String delta;
    public String goalId;

    public String note;

    public LogEntity(LocalDate date, String goalId) {
        this.date = date;
        this.goalId = goalId;
        this.complete = false;
    }

    public LogEntity(AddLog addLog){
        this.date = addLog.getDate();
        this.complete = addLog.isComplete();
        this.goalId = addLog.getGoalId();
        this.note = addLog.getNote();
    }

    public ObjectId getId() {
        return id;
    }

}


