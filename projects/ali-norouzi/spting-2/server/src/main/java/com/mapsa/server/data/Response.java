package com.mapsa.server.data;

import lombok.Data;

@Data
public class Response {
    private boolean status;
    private int code;
    private String description;

}
