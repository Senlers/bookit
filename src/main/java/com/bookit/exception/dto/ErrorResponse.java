package com.bookit.exception.dto;

import java.util.List;

public class ErrorResponse {

    private String error;
    private String timestamp;
    private int status;
    private String title;
    private String msg;
    private String path;
    private List<FieldErrorDto> fieldErrors;

    public ErrorResponse() {
    }

    public ErrorResponse(String error, String timestamp, int status, String title, String msg, String path, List<FieldErrorDto> fieldErrors) {
        this.error = error;
        this.timestamp = timestamp;
        this.status = status;
        this.title = title;
        this.msg = msg;
        this.path = path;
        this.fieldErrors = fieldErrors;
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

    public String getError() {
        return error;
    }

    public List<FieldErrorDto> getFieldErrors() {
        return fieldErrors;
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

    public void setError(String error) {
        this.error = error;
    }

    public void setFieldErrors(List<FieldErrorDto> fieldErrors) {
        this.fieldErrors = fieldErrors;
    }
}
