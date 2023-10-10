package com.exemplar.arete.web.log.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AddLog {
    private String goalId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDate date;
    private boolean complete;
    private String realized;
    private String note;

    public AddLog(String goalId, LocalDate date, boolean complete, String realized, String note) {
        this.goalId = goalId;
        this.date = date;
        this.complete = complete;
        this.realized = realized;
        this.note = note;
    }
}
