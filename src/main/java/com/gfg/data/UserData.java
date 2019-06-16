package com.gfg.data;

import com.gfg.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserData {

    public static Map<Long, User> userMap = new HashMap<Long, User>();

    static {
        User u1 = new User("Ronald","duncon",0);
        User u2 = new User("Bob","Builder",1);
        User u3 = new User("Richard","Barraclough", 3);
        User u4 = new User("Chris","Hope",4);

        userMap.put(u1.getId(),u1);
        userMap.put(u2.getId(),u2);
        userMap.put(u3.getId(),u3);
        userMap.put(u4.getId(),u4);
    }
}
