package com.ctime.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ctime.dao.RoleDAO;
import com.ctime.dao.UserDAO;
import com.ctime.entity.Role;
import com.ctime.entity.User;
import com.ctime.user.CtimeUser;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {


	@Autowired
	private UserDAO userDAO;

	@Autowired
	private RoleDAO roleDAO;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	@Transactional
	public User findByUsername(String username) {
		return userDAO.findByUsername(username);
	}

	@Override
	@Transactional
	public void save(CtimeUser ctimeUser) {
		User user = new User();
		 // assign user details to the user object
		user.setUserName(ctimeUser.getUsername());
		user.setPassword(passwordEncoder.encode(ctimeUser.getPassword()));
		user.setFirstName(ctimeUser.getFirstName());
		user.setLastName(ctimeUser.getLastName());
		user.setCompanyName(ctimeUser.getCompanyName());
		user.setCompanyEmail(ctimeUser.getCompanyEmail());

		user.setRoles(Arrays.asList(roleDAO.findRoleByName("ROLE_UNCHECKED")));
		userDAO.save(user);
	}

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userDAO.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),
				mapRolesToAuthorities(user.getRoles()));
	}

	private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
	}
}
