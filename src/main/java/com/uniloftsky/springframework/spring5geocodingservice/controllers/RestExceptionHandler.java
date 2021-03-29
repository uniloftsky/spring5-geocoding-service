package com.uniloftsky.springframework.spring5geocodingservice.controllers;

import com.uniloftsky.springframework.spring5geocodingservice.exceptions.NotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler({NotFoundException.class})
    public ResponseEntity<Object> handleNotFoundException(Exception exception, WebRequest request) {
        return new ResponseEntity<Object>("Resource not found. Cause: " + exception.getMessage() , new HttpHeaders(), HttpStatus.NOT_FOUND);
    }

}
