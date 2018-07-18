package com.my.api;

import com.my.api.beans.MyBean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RootConfiguration {

    @Bean
    @Qualifier("myBean")
    MyBean myBean1() {
        return new MyBean("bean1", this::functionMyBean1);
    }

    @Bean
    @Qualifier("myBean")
    MyBean myBean2() {
        return new MyBean("bean2", this::myBean2);
    }

    @Bean
    @Qualifier("myBean")
    MyBean myBean3() {
        return new MyBean("bean3", this::functionMyBean3);
    }

    private String functionMyBean1(String in) {
        return in;
    }

    private String myBean2(String in) {
        return in;
    }

    private String functionMyBean3(String in) {
        return in;
    }
}