package com.project.project.controller;

import com.project.project.model.Type_Role;
import com.project.project.repository.Type_RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;
import javax.validation.Valid;
import java.util.Set;


@RestController
public class RoleController {

    @Autowired
    private Type_RoleRepository roleRepository;


    @GetMapping("/roles")
    public Set<Type_Role> getAllRoles() {
        return (Set<Type_Role>) roleRepository.findAll();
    }

    @PostMapping(value = "/roles", consumes =  "application/json", produces = "application/json")
    public Type_Role createPost(@Valid @RequestBody Type_Role role) {
        return roleRepository.save(role);
    }

    @PutMapping("/roles/{roleId}")
    public Type_Role updatePost(@PathVariable Long roleId, @Valid @RequestBody Type_Role postRequest) {
        return roleRepository.findById(roleId).map(role -> {
            role.setRoleName(postRequest.getRoleName());
            return roleRepository.save(role);
        }).orElseThrow(() -> new ResourceAccessException("RoleId " + roleId + " not found"));
    }


    @DeleteMapping("/roles/{roleId}")
    public ResponseEntity<?> deletePost(@PathVariable Long roleId) {
        return roleRepository.findById(roleId).map(post -> {
            roleRepository.delete(post);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceAccessException("RoleId " + roleId + " not found"));
    }


}
