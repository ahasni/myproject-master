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

	@CrossOrigin()
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

	@CrossOrigin()
    @DeleteMapping("/users/{id_user}")
    public void deleteUser(@PathVariable int id_user){
        userRepository.deleteById(id_user);
    }

	@CrossOrigin()
    @PostMapping(value = "/users", consumes =  "application/json", produces = "application/json")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

	@CrossOrigin()
    @PutMapping("/users/{id_user}")
        public User updateUser (@PathVariable int id_user,@Valid  @RequestBody User putRequest) {

        return userRepository.findById(id_user).map(user -> {
            user.setFirst_name(putRequest.getFirst_name());
            user.setLast_name(putRequest.getLast_name());
            user.setEmail(putRequest.getEmail());
            user.setPassword(putRequest.getPassword());
            user.setAddress(putRequest.getAddress());
            user.setPhone_number(putRequest.getPhone_number());
            user.setPhoto(putRequest.getPhoto());
            user.setGender(putRequest.getGender());
            return userRepository.save(user);
        }).orElseThrow(() -> new ResourceAccessException("id_user " + id_user + " not found"));
    }
}


