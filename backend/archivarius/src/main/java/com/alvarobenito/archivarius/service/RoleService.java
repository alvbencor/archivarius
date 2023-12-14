package com.alvarobenito.archivarius.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvarobenito.archivarius.entities.RoleEntity;
import com.alvarobenito.archivarius.repository.RoleRepository;
import com.alvarobenito.archivarius.utils.EnumRole;

@Service
public class RoleService {

	@Autowired
    private RoleRepository roleRepository;

    public RoleEntity findByName(EnumRole roleName) {
        return roleRepository.findByName(roleName);
    }


}
