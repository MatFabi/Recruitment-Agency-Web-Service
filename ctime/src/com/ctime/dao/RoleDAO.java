package com.ctime.dao;

import com.ctime.entity.Role;

public interface RoleDAO {

	public Role findRoleByName(String theRoleName);
	
}