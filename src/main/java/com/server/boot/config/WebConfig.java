package com.server.boot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.server.boot.interceptor.MethodInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private MethodInterceptor methodInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(methodInterceptor)
                .addPathPatterns("/**"); // 원하는 경로 패턴을 지정
    }
}
