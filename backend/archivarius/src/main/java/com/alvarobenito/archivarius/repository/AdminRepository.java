package com.alvarobenito.archivarius.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alvarobenito.archivarius.entities.UserEntity;

@Repository
public interface AdminRepository extends CrudRepository<UserEntity, Long> {
	
	@EntityGraph(attributePaths = "roles")
    List<UserEntity> findAll();
	

}
