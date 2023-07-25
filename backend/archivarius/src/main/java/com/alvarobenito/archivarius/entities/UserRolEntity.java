package com.alvarobenito.archivarius.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_rol")
public class UserRolEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private UserEntity user;

	@ManyToOne
	@JoinColumn(name = "rol_id", nullable = false)
	private RoleEntity rol;
	
	public UserRolEntity() {
		
	}

	public UserRolEntity(Long id, UserEntity user, RoleEntity rol) {
		super();
		this.id = id;
		this.user = user;
		this.rol = rol;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public RoleEntity getRol() {
		return rol;
	}

	public void setRol(RoleEntity rol) {
		this.rol = rol;
	}

}
