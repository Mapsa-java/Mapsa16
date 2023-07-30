package com.mapsa.Lesson.exception;

import java.io.Serializable;

public class ErrorMessage implements Serializable {

    private int code ;
    private String message;

    public ErrorMessage(int code, String name) {
        this.code = code;
        this.message = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
