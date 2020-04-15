package com.bootcamp.ECommerceApplication.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FOUND)
public class CategoryFoundException extends RuntimeException{
    public CategoryFoundException(String message) {
        super(message);
    }
}
