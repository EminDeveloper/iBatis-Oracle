package com.example.ibatisoracle.controller;

import com.example.ibatisoracle.entity.UserSession;
import com.example.ibatisoracle.service.BatisService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/test")
public class BatisController {

    private final BatisService batisService;

    @PostMapping("/save")
    public void saveEntity(@RequestBody UserSession request){
        batisService.insertUserSession(request);
    }
}
