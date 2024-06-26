package com.coffee.lovers.model;

import java.time.LocalDateTime;

public record ExceptionResponse(
        String message,
        String status,
        LocalDateTime timestamp
        ) {
}
