package com.exemplar.arete.persistence.goal;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "goals")
public class GoalEntity {

    @Id
    private ObjectId id;
    public String userId;
    public String goalName;
    public String category;
    public String quantitativeType;
    public String goalTarget;

    public List<ObjectId> logIds;

    public GoalEntity(String goalName, String category, String quantitativeType, String goalTarget, String userId) {
        this.userId = userId;
        this.goalName = goalName;
        this.category = category;
        this.quantitativeType = quantitativeType;
        this.goalTarget = goalTarget;
        this.logIds = new ArrayList<>();
    }
}
