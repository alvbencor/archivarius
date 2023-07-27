package com.alvarobenito.archivarius.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alvarobenito.archivarius.entities.RoleEntity;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
	

}
