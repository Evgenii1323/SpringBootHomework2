package com.example.springboothomework2;

public class InvalidCredentials extends Exception {
    public InvalidCredentials(String message) {
        super(message);
    }
}