package com.example.ibatisoracle.service;

import com.example.ibatisoracle.entity.Order;
import com.example.ibatisoracle.entity.UserSession;
import com.example.ibatisoracle.mapper.BatisMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BatisService {

    private final BatisMapper batisMapper;

    /* Insert User Session */
    public void insertUserSession(UserSession userSession) {
        batisMapper.saveUserSession(userSession);
    }

    /* Insert Order */
    void insertOrder(Order order){
        batisMapper.saveOrder(order);
    }

    /* Find Order by User Session */
    public Order getOrderBySession(String session){
        System.out.println("session: " + session );
        Order orderByUserSession = batisMapper.findOrderByUserSession(session);
        System.out.println("Result: " + orderByUserSession);
        return orderByUserSession;
    }
}
