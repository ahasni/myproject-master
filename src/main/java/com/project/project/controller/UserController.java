package com.project.project.controller;

import com.project.project.model.User;
import com.project.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List <User> getAllUsers(){
        return (List<User>) userRepository.findAll();
    }
    @GetMapping("/user/{idUser}")
    public User getUser (@PathVariable long idUser) {
        Optional<User> user = userRepository.findById(idUser);
        return user.get();
    }
    @DeleteMapping("/user/{idUser}")
    public void deleteUser(@PathVariable long idUser){
        userRepository.deleteById(idUser);
    }
    @PostMapping("/user/create")
    public User createUser (@RequestBody User user){
     User _user = userRepository.save(new User(user.getIdUser(),user.getGender(),user.getPhoneNumber(),
         user.getPhoto(),user.getPassword(),user.getEmail(),user.getFirstName(),user.getLastName(),user.getAddress()));
      return _user;
    }

@PutMapping("/user/{idUser}")
    public ResponseEntity<User> updateUser (@PathVariable("id") long idUser, @RequestBody User user) {
    Optional<User> userData = userRepository.findById(idUser);
    User _user = userData.get();
    _user.setAddress(user.getAddress());
    _user.setEmail(user.getEmail());
    _user.setFirstName(user.getFirstName());
    _user.setLastName(user.getLastName());
    _user.setGender(user.getGender());
    _user.setPassword(user.getPassword());
    _user.setPhoto(user.getPhoto());
    _user.setPhoneNumber(user.getPhoneNumber());
    return new ResponseEntity<>(userRepository.save(_user), HttpStatus.OK);
}}
