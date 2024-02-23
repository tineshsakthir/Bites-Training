package com.tinesh.Day6;

public class ImmutableClass {
    private final String name ;
    private final String pin ;

    public ImmutableClass(String name, String pin) {
        this.name = name;
        this.pin = pin;
    }
}
