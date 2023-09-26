package com.exemplar.arete.web.user;

import com.exemplar.arete.domain.users.User;
import com.exemplar.arete.web.user.ports.UserWebPorts;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@AllArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserWebPorts userWebPorts;

    @GetMapping("/{id}")
    public User getUser (@PathVariable String id){
        return userWebPorts.getUserById(id);
    }


}
