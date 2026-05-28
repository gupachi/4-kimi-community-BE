package org.example._kimicommunitybe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example._kimicommunitybe.dto.UserJoinDTO;
import org.example._kimicommunitybe.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class UserService {
    //의존성 주입.
    @Autowired
    UserRepository userRepository;

    //controller post 요청이 들어오면 repository에 post 실행.
    public UserJoinDTO insertUser( UserJoinDTO user){
        //1.이메일 중복 허용 체크

        return userRepository.insertUser(user);
    }
    //controller get user 전체 읽기 요청이 들어오면 repository에 getAll 실행.
    public List<UserJoinDTO> getAllUsers() {

        return userRepository.getAllUsers();
    }

}