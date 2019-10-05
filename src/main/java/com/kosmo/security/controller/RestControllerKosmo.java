package com.kosmo.security.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class RestControllerKosmo {

    @GetMapping("/")
    public String getMappingTest(){
        log.info("get 메핑의 요청입니다.");
        return "GET 요청 입니다.\n";
    }

    @PostMapping("/")
    public String postMappingTest(){
        log.info("post 메핑의 요청입니다.");
        return "POST 요청 입니다.\n";
    }

    @PutMapping("/")
    public String putMappingTest(){
        log.info("put 메핑의 요청입니다.");
        return "PUT 요청 입니다.\n";
    }

    @DeleteMapping("/")
    public String deleteMappingTest(){
        log.info("delete 메핑의 요청입니다.");
        return "DELETE 요청 입니다.\n";
    }
}
