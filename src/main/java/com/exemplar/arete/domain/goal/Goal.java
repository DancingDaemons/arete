package com.exemplar.arete.domain.goal;

import com.exemplar.arete.domain.log.Log;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Goal {

    private String id;
    private String userId;
    private String goalName;
    private String category;
    private String quantitativeType;
    private String goalTarget;
    public List<ObjectId> logIds;

}
