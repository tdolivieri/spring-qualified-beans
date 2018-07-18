package com.my.api.controller;

import com.my.api.beans.MyBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping
public class MyController {

    @Autowired
    private List<MyBean> beans;

    @RequestMapping(value = "beans", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String get() {
        return beans.stream()
            .map(MyBean::toString)
            .collect(Collectors.joining(";"));
    }
}
