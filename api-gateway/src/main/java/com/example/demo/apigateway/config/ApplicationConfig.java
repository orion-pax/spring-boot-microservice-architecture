package com.example.demo.apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.codec.ServerCodecConfigurer;

public class ApplicationConfig {

    @Bean
    public ServerCodecConfigurer createServerCodecConfigurer(){
        return ServerCodecConfigurer.create();
    }
}
