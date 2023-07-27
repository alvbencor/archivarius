package com.alvarobenito.archivarius.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvarobenito.archivarius.entities.UserEntity;
import com.alvarobenito.archivarius.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public List<UserEntity> getAllUsers() {
		return userRepository.findAll();
	}

}
