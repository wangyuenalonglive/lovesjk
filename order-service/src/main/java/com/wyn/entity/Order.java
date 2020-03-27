package com.wyn.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Order {

    private Integer id;
    private String orderNo;
    private Integer userId;
    private String username;
}
