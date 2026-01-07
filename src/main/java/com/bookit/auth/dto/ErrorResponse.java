package com.bookit.auth.dto;

import java.util.List;

public class ErrorResponse {

    private String timestamp;
    private int status;
    private String title;
    private String msg;
    private String path;
    private List<FieldErrorDto> errors;

    public ErrorResponse() {}

    public ErrorResponse(String timestamp, int status, String title, String msg, String path, List<FieldErrorDto> errors) {
        this.timestamp = timestamp;
        this.status = status;
        this.title = title;
        this.msg = msg;
        this.path = path;
        this.errors = errors;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public int getStatus() {
        return status;
    }

    public String getTitle() {
        return title;
    }

    public String getMsg() {
        return msg;
    }

    public String getPath() {
        return path;
    }

    public List<FieldErrorDto> getErrors() {
        return errors;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setErrors(List<FieldErrorDto> errors) {
        this.errors = errors;
    }
}
