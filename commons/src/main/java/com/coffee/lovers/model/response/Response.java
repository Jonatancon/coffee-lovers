package com.coffee.lovers.model.response;

import java.util.List;

public record Response<T>(
        List<T> models,
        String message,
        String code
) {}
