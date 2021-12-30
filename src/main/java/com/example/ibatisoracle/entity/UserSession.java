package com.example.ibatisoracle.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserSession {
    private int id;
    private String browserLanguage;
    private String browserUserAgent;
    private String sessionId;
    private String startTime;
    private String endTime;
    private String status;

}
