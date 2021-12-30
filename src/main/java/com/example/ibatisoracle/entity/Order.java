package com.example.ibatisoracle.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {

    private int id;
    private String userSessionId;
    private String hppUrl;
    private Long orderId;
    private String status;
    private String password;
    private String amount;
    private String currency;

}
