package com.example.demo.model;

public class ResponseOjbect {
    private String Status;
    private String Message;
    private Object Data;

    public ResponseOjbect() {
    }

    public ResponseOjbect(String status, String message, Object data) {
        Status = status;
        Message = message;
        Data = data;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public Object getData() {
        return Data;
    }

    public void setData(Object data) {
        Data = data;
    }
}
