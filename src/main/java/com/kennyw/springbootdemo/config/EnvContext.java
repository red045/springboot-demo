package com.kennyw.springbootdemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * 环境变量
 * Created by Administrator on 2018/3/19 0019
 */
@Configuration
public class EnvContext {

    @Value("${debug.mode}")
    private boolean debug;

    public boolean isDebug() {
        return debug;
    }
}
