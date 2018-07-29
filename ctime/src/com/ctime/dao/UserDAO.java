package com.ctime.dao;

import com.ctime.entity.User;

public interface UserDAO {
	
    User findByUsername(String username);
    
    void save(User user);
}
