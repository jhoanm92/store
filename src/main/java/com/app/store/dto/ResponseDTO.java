package com.app.store.dto;

import lombok.Data;

@Data
public class ResponseDTO<T> {

    private int code;
    private T data;
    private String message;
    private String status;

    public ResponseDTO(int code, T data, String message, String status) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.status = status;
    }
}
