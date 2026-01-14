package com.bookit.exception.dto;

public class FieldErrorDto {

    private String field;
    private String description;

    public FieldErrorDto(){}

    public FieldErrorDto(String field, String description) {
        this.field = field;
        this.description = description;
    }

    public String getField() {
        return field;
    }

    public String getDescription() {
        return description;
    }

    public void setField(String field) {
        this.field = field;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
