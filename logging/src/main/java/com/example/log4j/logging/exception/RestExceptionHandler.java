package com.example.log4j.logging.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler
{
    @ExceptionHandler(InterruptedException.class)
    public ResponseEntity handleUserNotFoundException(InterruptedException exception) {
        System.out.println("username not found");
        String message = exception.getMessage();
        return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);

    }


}
