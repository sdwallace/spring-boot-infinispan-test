package com.sample.domain;

import javax.persistence.Cacheable;

public class Greeting {

    private final String name;

    public Greeting(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}