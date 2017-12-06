package me.arkenum.leilao.controller;

public class LoginResult {
    private boolean success;
    private String message;

    public LoginResult() {
    }

    public LoginResult(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}
