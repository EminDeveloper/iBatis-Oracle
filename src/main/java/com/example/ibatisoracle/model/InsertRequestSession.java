package com.example.ibatisoracle.model;

import lombok.Data;

@Data
public class InsertRequestSession {
    private String browserLanguage;
    private String browserUserAgent;
    private String sessionId;
    private String status;

}
