package com.ctime.service;


import com.ctime.entity.User;
import com.ctime.user.CtimeUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByUsername(String username);

    void save(CtimeUser ctimeUser);
}
