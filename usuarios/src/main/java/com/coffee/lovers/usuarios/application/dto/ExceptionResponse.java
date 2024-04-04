package com.coffee.lovers.usuarios.application.dto;

import java.time.LocalDateTime;

public record ExceptionResponse(
        String message,
        String status,
        LocalDateTime timestamp
        ) {
}
