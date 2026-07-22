package com.testapp;

public class App {
    public static String greet(String name) {
        return "Hey there, " + name; // changed wording, breaks existing assertion
    }
}