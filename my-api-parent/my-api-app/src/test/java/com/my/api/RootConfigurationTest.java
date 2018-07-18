package com.my.api;

import com.my.api.beans.MyBean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

@SuppressWarnings("javadoc")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfiguration.class})
public class RootConfigurationTest {

    @Autowired(required = false)
    private List<MyBean> myBeans = Collections.emptyList();

    @Test
    public void shouldCreateListOfBeans() {
        assertEquals(3, myBeans.size());
    }
}
