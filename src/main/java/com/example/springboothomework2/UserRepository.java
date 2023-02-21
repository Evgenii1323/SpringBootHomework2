package com.example.springboothomework2;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class UserRepository {
    private final ConcurrentHashMap<String, String> users = new ConcurrentHashMap<>();

    public List<Authorities> getUserAuthorities(String user, String password) {
        users.put("EVGENII", "111");

        if(users.containsKey(user)) {
            if (users.get(user).equals(password)) {
                List<Authorities> list = new LinkedList<>();
                list.add(Authorities.WRITE);
                return list;
            }
        }
        return new LinkedList<>();
    }
}