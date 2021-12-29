package com.example.ibatisoracle.controller;

import com.example.ibatisoracle.entity.UserSession;
import com.example.ibatisoracle.utils.service.BatisService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class BatisController {

    private BatisService batisService;

    @PostMapping("/save")
    public String saveEntity(UserSession request){
        UserSession us = new UserSession();
        us.setBrowserLanguage(request.getBrowserLanguage());
        us.setBrowserUserAgent(request.getBrowserUserAgent());
        us.setSessionId(request.getSessionId());
        int result = batisService.insertUserSession(us);
        return "OK! ID:   " + result;
    }
}
