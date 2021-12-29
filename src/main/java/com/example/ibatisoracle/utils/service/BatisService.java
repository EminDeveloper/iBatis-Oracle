package com.example.ibatisoracle.utils.service;

import com.example.ibatisoracle.entity.UserSession;
import com.example.ibatisoracle.utils.mapper.BatisMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class BatisService {

    private final BatisMapper batisMapper;

    public BatisService(BatisMapper batisMapper) {
        this.batisMapper = batisMapper;
    }

    public int insertUserSession(UserSession userSessionRequest) {
        UserSession userSession = new UserSession();
        userSession.setBrowserLanguage(userSessionRequest.getBrowserLanguage());
        userSession.setBrowserUserAgent(userSessionRequest.getBrowserUserAgent());
        userSession.setSessionId(userSessionRequest.getSessionId());
        userSession.setStatus("Activett");
        int result = batisMapper.saveUserSession(userSessionRequest);

        return result;
    }

}
