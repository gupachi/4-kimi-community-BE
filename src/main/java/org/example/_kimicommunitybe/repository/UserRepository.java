package org.example._kimicommunitybe.repository;

import org.example._kimicommunitybe.dto.UserJoinDTO;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
//CRUD 로직 처리, DB 접근 처리
public class UserRepository {
    //JVM 메모리에 user 정보를 저장할 ArrayList 를 정의한다.
    static public ArrayList<UserJoinDTO> users;

    //이 클래스에 사용되는 모든 users 이름의 ArrayList 는 계속 하나의 ArrayList 를 참조한다.
    static {
        //ArrayList 생성
        users = new ArrayList<>();
        //값 추가
        users.add(new UserJoinDTO("kim","1234","tester1","https://image.kr/img.jpg"));

    }

    //CREATE 문.
    public UserJoinDTO insertUser(UserJoinDTO user){
        users.add(user);
        return  user;
    }

    //READ 문
    //저장되있는 전체 정보 조회.
    public List<UserJoinDTO> getAllUsers(){
        return users;
    }




}