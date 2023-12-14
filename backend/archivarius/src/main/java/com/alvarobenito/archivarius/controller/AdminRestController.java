package com.alvarobenito.archivarius.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvarobenito.archivarius.entities.UserEntity;
import com.alvarobenito.archivarius.service.AdminService;

@RestController
@RequestMapping("/archivarius/v1/admin")
public class AdminRestController {
	
@Autowired AdminService userService;
    
	@GetMapping
    public List<UserEntity> getAllUsersWithRoles() {
        return userService.getAllUsersWithRoles();
    }

}
