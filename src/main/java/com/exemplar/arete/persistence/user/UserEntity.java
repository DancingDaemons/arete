package com.exemplar.arete.persistence.user;

import com.exemplar.arete.domain.goal.Goal;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "users")
public class UserEntity {

    @Id
    private ObjectId id;
    public String username;
    public String email;

    public List<Goal> goals;

    public UserEntity(String username, String email) {
        this.goals = new ArrayList<>();
        this.username = username;
        this.email = email;
    }
}
