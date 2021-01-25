package com.thoughtworks.capacity.gtb.mvc;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    private Map<String, User> userMap = new HashMap<>();

    public UserService() {
        userMap.put("Tom", new User(1, "Tom", "12345", "tom@qq.com"));
    }

    public void createUser(User user) {
        String username = user.getUsername();
        if(userMap.containsKey(username)) {
            throw new UserExistsException("User already exists.");
        }
        user.setId(userMap.size() + 1);
        userMap.put(username, user);
    }

    public boolean auth(String username, String password) {
        User record = userMap.get(username);
        if(record == null) return false;

        if(record.getPassword().equals(password)) {
            return true;
        }
        return false;
    }

    public User getUserByName(String username) {
        return userMap.get(username);
    }
}
