package com.kennyw.springbootdemo.config;

import com.kennyw.springbootdemo.SpringbootDemoApplication;
import com.kennyw.springbootdemo.util.SpringBeanUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/3/19 0019
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=SpringbootDemoApplication.class)
public class EnvContextTest {

    @Autowired
    private EnvContext envContext;

    @Test
    public void isDebug() {
        assertTrue(envContext.isDebug());
    }

}