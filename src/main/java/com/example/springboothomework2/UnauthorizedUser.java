package com.example.springboothomework2;

public class UnauthorizedUser extends Exception {
    public UnauthorizedUser(String message) {
        super(message);
    }
}