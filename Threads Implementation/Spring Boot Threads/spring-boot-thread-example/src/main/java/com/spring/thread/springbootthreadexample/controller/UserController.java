package com.spring.thread.springbootthreadexample.controller;

import com.spring.thread.springbootthreadexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.concurrent.CompletableFuture;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping(value = "/users",consumes={MediaType.MULTIPART_FORM_DATA_VALUE},produces = "application/json")
    public ResponseEntity saveUser(@RequestParam(value = "files") MultipartFile[] files) throws Exception {
        for(MultipartFile file:files){
            service.saveUser(file);
        }
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
     @GetMapping(value = "/users", produces = "application/json")
      public CompletableFuture<ResponseEntity> findAllUser(){
          return  service.findAllUsers().thenApply(ResponseEntity::ok);
      }
}
