package ub.LMS.service;

import ub.LMS.model.User;

public interface UserService {
    void save(User user);
    User findByUsername(String username);
}
