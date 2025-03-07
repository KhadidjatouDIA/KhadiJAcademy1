package com.dev.backend_school.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@NoArgsConstructor
@Getter
@Setter
public class ApiException {
    private String message;
    private LocalDateTime timestamp;

    public ApiException(String message, LocalDateTime timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }
}