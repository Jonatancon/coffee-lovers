package com.coffee.lovers.model.request;

import java.util.List;

public record Request<T>(
        String ip,
        List<T> models
) {}
