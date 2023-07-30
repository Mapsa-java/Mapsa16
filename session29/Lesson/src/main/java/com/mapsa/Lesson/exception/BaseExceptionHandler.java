package com.mapsa.Lesson.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.NoSuchElementException;

@ControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler({MethodArgumentNotValidException.class})
    public ResponseEntity<ErrorMessage> methodArgExceptionHandler(MethodArgumentNotValidException error) {
        return new ResponseEntity<>(new ErrorMessage(406, error.getAllErrors().get(0).getDefaultMessage())
                , HttpStatus.NOT_ACCEPTABLE);
    }

    @ExceptionHandler({NoSuchElementException.class})
    public ResponseEntity<ErrorMessage> noSuchElementExceptionHandler() {
        System.out.println("in noSuchElementExceptionHandler method");
        return new ResponseEntity<>(new ErrorMessage(404, "Item Not Found!")
                , HttpStatus.NOT_FOUND);

    }
}
