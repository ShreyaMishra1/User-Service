package com.customerservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customerservice.entity.Users;
import com.customerservice.repository.UserRepository;
import com.customerservice.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<Users> getAllUsers() {
	
		return (List<Users>) userRepository.findAll();
	}

	@Override
	public Users getUsersById(int userId) {
		return userRepository.findById(userId).orElse(null);
	}

	@Override
	public Users addOrUpdateUser(Users user) {
		return userRepository.save(user);
	}
	@Override
	public Users updateUser(Users user) {
		return userRepository.save(user);
	}

	/*@Override
	 public Users deleteUsersById(int userId) throws Exception {
		Users.deletedUser=null;
		try {
			deletedUser=userRepository.findById(userId).orElse(null);
			if(deletedUser==null) {
				throw new Exception("User not available");
			}else {
				userRepository.deleteById("userId");
			}
		}
		catch(Exception ex) {
			throw ex;
		}
		return null;
	}*/

}
