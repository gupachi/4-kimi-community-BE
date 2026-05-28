package org.example._kimicommunitybe.controller;

import org.example._kimicommunitybe.dto.UserJoinDTO;
import org.example._kimicommunitybe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//controller 는  실질적으로 Url에서 다음과 같이 올바른 형식을 입력하면 해당 service(비즈니스) 로직이 실행되게 한다.
@RestController
@RequestMapping("/users")
public  class UserController {
    @Autowired
    UserService userService;

    //create 요청은 post를 날리니까  PostMapping 어노테이션을 단다.
    //UserJoinDTO 를 Request body로서 받는다.
    @PostMapping
    public UserJoinDTO insertUser(@Validated @RequestBody UserJoinDTO user){
        return userService.insertUser(user);
    }
    //get all  요청은 get 요청를 날리니까  GETMapping 어노테이션을 단다.
    @GetMapping
    public List<UserJoinDTO> getAllUsers() {
        return  userService.getAllUsers();
    }
}
