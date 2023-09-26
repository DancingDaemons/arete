package com.exemplar.arete.domain.log;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class Log {

    private String id;
    private String goalId;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    private boolean complete;
    private String realized;
    private String note;

    public Log(LocalDate date, String goalId) {
        this.date = date;
        this.goalId = goalId;
        this.complete = false;
    }

}


