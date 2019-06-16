package com.gfg.controller;

import com.gfg.data.UserData;
import com.gfg.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    public Map<Long,User> userMap = UserData.userMap;

    @GetMapping("/users")
    public List<User> getUsers() {
        List<User> users =  new ArrayList<User>();
        for(Map.Entry<Long,User> entry : userMap.entrySet()) {
            users.add(entry.getValue());
        }
        return users;
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id) {
        return userMap.get(id);
    }

    @PostMapping("/user")
    public boolean addUser(@RequestBody User user) {
        boolean status = userMap.containsKey(user.getId());
        if (status = false) userMap.put(user.getId(),user);
        return status;
    }

    @PutMapping("/user")
    public boolean updateUser(@RequestBody User user) {
        userMap.put(user.getId(),user);
        return userMap.get(user.getId()) == user;
    }
}
