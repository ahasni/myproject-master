package com.project.project.repository;

import com.project.project.model.Type_Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Type_RoleRepository extends CrudRepository <Type_Role, Long> {
}

