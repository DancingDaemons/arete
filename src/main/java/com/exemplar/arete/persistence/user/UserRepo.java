package com.exemplar.arete.persistence.user;

import com.exemplar.arete.domain.users.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepo extends MongoRepository<User, String> {
    User findByEmail(@Param("email") String email);

}
