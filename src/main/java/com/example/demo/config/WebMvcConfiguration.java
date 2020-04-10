package com.example.demo.config;

import com.example.demo.config.interceptor.SampleInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

    private final SampleInterceptor sampleInterceptor;

    public WebMvcConfiguration(SampleInterceptor sampleInterceptor) {
        this.sampleInterceptor = sampleInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(sampleInterceptor).addPathPatterns("/**/sample/**");
    }
}
