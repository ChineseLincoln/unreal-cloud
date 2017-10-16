package org.unreal.cloud.user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.unreal.cloud.common.handler.GlobalExceptionHandler;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Bean
    public GlobalExceptionHandler providerExceptionHandler(){
        return new GlobalExceptionHandler();
    }
}
