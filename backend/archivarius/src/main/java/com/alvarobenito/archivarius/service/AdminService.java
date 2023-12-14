package com.alvarobenito.archivarius.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvarobenito.archivarius.entities.UserEntity;
import com.alvarobenito.archivarius.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	AdminRepository userRepository;
	
	public List<UserEntity> getAllUsersWithRoles() {
	        return userRepository.findAll();
	   }

	public void saveUser(UserEntity user) {
	    try {
	        userRepository.save(user);
	        System.out.println("User ID after save: " + user.getId());
	        System.out.println("User saved successfully.");
	    } catch (Exception e) {
	        System.err.println("Error saving user: " + e.getMessage());
	    }
	}

}
