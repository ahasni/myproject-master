package com.project.project.repository;

import com.project.project.model.Type_Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Type_RoleRepository extends JpaRepository <Type_Role, Long> {
}

