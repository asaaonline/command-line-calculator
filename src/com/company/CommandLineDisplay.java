package com.company;

public class CommandLineDisplay implements Display {
    @Override
    public void display(String s) {
        System.out.println(s);
    }
}
