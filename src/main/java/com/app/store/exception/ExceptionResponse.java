package com.app.store.exception;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ExceptionResponse {
    private LocalDateTime date;
    private String message;
    private String detail;

    public ExceptionResponse(LocalDateTime date, String message, String detail) {
        this.date = date;
        this.message = message;
        this.detail = detail;
    }
}