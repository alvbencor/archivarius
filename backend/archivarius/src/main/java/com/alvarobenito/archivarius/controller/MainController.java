package com.alvarobenito.archivarius.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alvarobenito.archivarius.repository.AdminRepository;
import com.alvarobenito.archivarius.service.AdminService;

@Controller
@RequestMapping("/archivarius/v1")
public class MainController {
	
	@Autowired
	AdminService userService;
	
	@Autowired
	AdminRepository userRepository;
	
	@GetMapping("/public")
	public ResponseEntity<String> publicPage() {
	    String message = "Ruta publica de usuarios";
	    return ResponseEntity.ok(message);
	}
	
	@GetMapping("/private")
	public ResponseEntity<String> privatePage() {
	    String message = "Ruta privada de usuarios";
	    return ResponseEntity.ok(message);
	}
}
