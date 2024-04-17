package com.coffee.lovers.util;

import com.coffee.lovers.model.response.Response;

import java.util.Collections;
import java.util.List;

public class BuildResponse<T> {

    public static <T> Response<T> buildResponse(String message, String status, List<T> objects) {

        return new Response<>(
                objects == null? Collections.emptyList():objects,
                message,
                status
        );
    }
}
