package com.exemplar.arete.domain.users;

import com.exemplar.arete.domain.goal.Goal;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class User {

    private String id;
    private String username;
    private String email;
    private List<Goal> goals;

    public User(String username, String email) {
        this.goals = new ArrayList<>();
        this.username = username;
        this.email = email;
    }
}
