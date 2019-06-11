package com.project.project.controller;

import com.project.project.model.Type_Role;
import com.project.project.model.User;
import com.project.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    @DeleteMapping("/users/{id_user}")
    public void deleteUser(@PathVariable long id_user){
        userRepository.deleteById(id_user);
    }

    @PostMapping(value = "/users", consumes =  "application/json", produces = "application/json")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }


    @PutMapping("/users/{id_user}")
        public User updateUser (@PathVariable long id_user,@Valid  @RequestBody User postRequest) {
        return userRepository.findById(id_user).map(user -> {
            user.setFirst_name(postRequest.getFirst_name());
            user.setLast_name(postRequest.getLast_name());
            user.setEmail(postRequest.getEmail());
            user.setPassword(postRequest.getPassword());
            user.setAddress(postRequest.getAddress());
            user.setPhone_number(postRequest.getPhone_number());
            user.setPhoto(postRequest.getPhoto());
            user.setGender(postRequest.getGender());
            return userRepository.save(user);
        }).orElseThrow(() -> new ResourceAccessException("id_user " + id_user + " not found"));
    }
}


