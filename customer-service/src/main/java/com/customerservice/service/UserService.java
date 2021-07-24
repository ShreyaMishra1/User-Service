package com.customerservice.service;

import com.customerservice.entity.Users;
import java.util.List;


public interface UserService {
	public List<Users> getAllUsers();
	public Users getUsersById(int userId);
	public Users addOrUpdateUser(Users user);
	public Users updateUser(Users user);
	
	//public Users deleteUsersById(int userId) throws Exception;
	
	

}
