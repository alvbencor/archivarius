package com.alvarobenito.archivarius.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alvarobenito.archivarius.entities.UserEntity;
import com.alvarobenito.archivarius.repository.UserRepository;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public boolean existsByUsernameOrEmail(String username, String email) {
        return userRepository.existsByUsernameOrEmail(username, email);
    }

	@Transactional
	public void saveUser(UserEntity userEntity) {

		userRepository.save(userEntity);

	}
	
	
	
	

}
