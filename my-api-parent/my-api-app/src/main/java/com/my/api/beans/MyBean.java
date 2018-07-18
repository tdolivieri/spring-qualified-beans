package com.my.api.beans;

import java.util.function.Function;

public class MyBean {

    private String name;
    private Function<String, String> function;

    public MyBean(String name, Function<String, String> function) {
        this.name = name;
        this.function = function;
    }

    @Override
    public String toString() {
        return "MyBean{"
                + "name='" + name
                + '}';
    }
}
