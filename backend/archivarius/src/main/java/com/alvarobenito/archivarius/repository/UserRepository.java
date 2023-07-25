package com.alvarobenito.archivarius.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alvarobenito.archivarius.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
	
	Optional<UserEntity> findByUsername(String username);

    Optional<UserEntity> findByUsernameOrEmail(String username, String email);

    boolean existsByUsername(String username);

}
