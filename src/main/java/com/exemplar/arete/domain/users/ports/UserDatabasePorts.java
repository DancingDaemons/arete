package com.exemplar.arete.domain.users.ports;

import com.exemplar.arete.domain.users.User;

public interface UserDatabasePorts {
    User getUser(String username);
}
