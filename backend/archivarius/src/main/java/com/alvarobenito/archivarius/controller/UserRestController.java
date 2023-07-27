package com.alvarobenito.archivarius.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvarobenito.archivarius.entities.UserEntity;
import com.alvarobenito.archivarius.service.UserService;

@RestController
@RequestMapping("/archivarius")
public class UserRestController {
	
	private static final Logger logger = Logger.getLogger(UserRestController.class.getName());
	
	@Autowired
	UserService userService;
	
	@GetMapping("")
	public ResponseEntity<String> publicPage() {
	    String message = "Ruta publica de archivarius";
	    return ResponseEntity.ok(message);
	}
	
	@GetMapping("/users")
    public ResponseEntity<List<UserEntity>> getAllUsers() {
        List<UserEntity> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }
	
	

}
