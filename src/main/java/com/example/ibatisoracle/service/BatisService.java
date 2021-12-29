package com.example.ibatisoracle.service;

import com.example.ibatisoracle.model.InsertRequestSession;
import com.example.ibatisoracle.entity.UserSession;
import com.example.ibatisoracle.mapper.BatisMapper;
import org.springframework.stereotype.Service;

@Service
public class BatisService {

    private final BatisMapper batisMapper;

    public BatisService(BatisMapper batisMapper) {
        this.batisMapper = batisMapper;
    }

    public String insertUserSession(InsertRequestSession userSessionRequest) {
        UserSession userSession = new UserSession();
        userSession.setBrowserLanguage(userSessionRequest.getBrowserLanguage());
        userSession.setBrowserUserAgent(userSessionRequest.getBrowserUserAgent());
        userSession.setSessionId(userSessionRequest.getSessionId());
        userSession.setStatus("Activett");

        batisMapper.saveUserSession(userSession);

        return "OK";
    }

}
