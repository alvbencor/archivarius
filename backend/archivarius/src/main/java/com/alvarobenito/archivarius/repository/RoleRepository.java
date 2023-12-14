package com.alvarobenito.archivarius.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alvarobenito.archivarius.entities.RoleEntity;
import com.alvarobenito.archivarius.utils.EnumRole;

@Repository
public interface RoleRepository extends CrudRepository<RoleEntity, Long> {
	
	RoleEntity findByName(EnumRole roleName);
	

}
