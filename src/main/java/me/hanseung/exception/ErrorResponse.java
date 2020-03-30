package me.hanseung.exception;

public class ErrorResponse {

    private String message;

    private String code;

    public ErrorResponse() {

    }

    public ErrorResponse(String m, String c) {
        this.message = m;
        this.code = c;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
