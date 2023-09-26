package com.exemplar.arete.web.user.ports;

import com.exemplar.arete.domain.users.User;

public interface UserWebPorts {
    User getUserById(String id);
}
