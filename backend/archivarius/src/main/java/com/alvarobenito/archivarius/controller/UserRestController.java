package com.alvarobenito.archivarius.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alvarobenito.archivarius.entities.RoleEntity;
import com.alvarobenito.archivarius.entities.UserEntity;
import com.alvarobenito.archivarius.service.AdminService;
import com.alvarobenito.archivarius.service.RoleService;
import com.alvarobenito.archivarius.service.UserService;
import com.alvarobenito.archivarius.utils.EnumRole;

@RestController
@RequestMapping("/archivarius/v1/users")
public class UserRestController {
	
	@Autowired UserService userService;
	@Autowired RoleService roleService;
	
	@PostMapping("/create")
	public ResponseEntity<String> createUser(@RequestBody UserEntity createUserRequest) {
	    try {
	        if (userService.existsByUsernameOrEmail(createUserRequest.getUsername(), createUserRequest.getEmail())) {
	            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
	                    .body("El nombre de usuario o correo electrónico ya está en uso.");
	        }

	        UserEntity newUser = new UserEntity();
	        newUser.setUsername(createUserRequest.getUsername());
	        newUser.setPassword(createUserRequest.getPassword());
	        newUser.setEmail(createUserRequest.getEmail());
	        newUser.setEnabled(true);

	        System.out.println("Nuevo usuario: " + newUser);

	        if (createUserRequest.getRoles() == null || createUserRequest.getRoles().isEmpty()) {
	            RoleEntity defaultRole = roleService.findByName(EnumRole.ROLE_USER);

	            if (defaultRole == null) {
	                throw new RuntimeException("El rol ROLE_USER no está configurado en la base de datos.");
	            }

	            newUser.setRoles(Collections.singleton(defaultRole));
	        } else {
	            Set<RoleEntity> roles = createUserRequest.getRoles().stream()
	                    .map(role -> new RoleEntity(role.getName()))
	                    .collect(Collectors.toSet());
	            newUser.setRoles(roles);
	        }
	        userService.saveUser(newUser);

	        return ResponseEntity.status(HttpStatus.CREATED).body("Usuario creado con éxito.");
	    } catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
	                .body("Error al crear el usuario: " + e.getMessage());
	    }
	}
	

}
