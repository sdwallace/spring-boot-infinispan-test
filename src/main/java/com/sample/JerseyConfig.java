package com.sample;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.sample.service.HelloWorldService;

@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
    	//TODO is there a way around this?  Some sort of self discovery instead.
        register(HelloWorldService.class);
    }
}