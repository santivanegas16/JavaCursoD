package com.triplebyte.models;

public class Response {

    private boolean success;
    private Object response;
    private String message;

    public Response() {

    }

    public Response(boolean success, Object response, String message) {
        this.success = success;
        this.response = response;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
