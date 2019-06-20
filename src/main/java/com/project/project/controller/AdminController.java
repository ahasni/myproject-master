package com.project.project.controller;
import com.project.project.model.Admin;
import com.project.project.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;

import javax.validation.Valid;
import java.util.List;


@RestController
public class AdminController {

    @Autowired
    private AdminRepository adminRepository;


    @GetMapping("/admins")
    public List<Admin> getAllAdmins() {
        return (List<Admin>) adminRepository.findAll();
    }

    @PostMapping(value = "/admins", consumes =  "application/json", produces = "application/json")
    public Admin creatPost (@Valid @RequestBody Admin admin) {
        return adminRepository.save(admin);
    }

    @PutMapping("/admins/{id_admin}")
    public Admin updateAdmin (@PathVariable int id_admin,@Valid  @RequestBody Admin postRequest) {
        return adminRepository.findById(id_admin).map(admin -> {
            return adminRepository.save(admin);
        }).orElseThrow(() -> new ResourceAccessException("id_admin " + " not found"));
    }



    @DeleteMapping("/admin/{admin_id}")
    public ResponseEntity<?> deletPost(@PathVariable int admin_id) {
        return adminRepository.findById(admin_id).map(post -> {
            adminRepository.delete(post);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceAccessException("admin_id " + " not found"));
    }


}
