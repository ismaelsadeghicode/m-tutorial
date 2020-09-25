package com.mapsa.springsecurity.data.jwt;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request implements Serializable {

    private String username;
    private String password;
}

//TODO CAPTCHA