package org.unreal.cloud.auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.unreal.cloud.auth.interceptor.FeignClientRequestInterceptor;
import org.unreal.cloud.common.handler.GlobalExceptionHandler;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Bean
    public GlobalExceptionHandler providerExceptionHandler(){
        return new GlobalExceptionHandler();
    }

    @Bean
    public FeignClientRequestInterceptor prioviderFeignClientRequestInterceptor(){ return new FeignClientRequestInterceptor();}
}
