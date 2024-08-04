package com.hotel.galaxy.service;


import com.hotel.galaxy.model.User;

import java.util.List;

/**
 * @author praveen patel
 */

public interface IUserService {
    User registerUser(User user);
    List<User> getUsers();
    void deleteUser(String email);
    User getUser(String email);
}