package com.sample;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.infinispan.Cache;
import org.infinispan.manager.DefaultCacheManager;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
@EnableCaching
public class InfinispanSpringBootStarter {

    public static void main(String[] args) {
    	
    	
        SpringApplication.run(InfinispanSpringBootStarter.class, args);
        //temporary test.
        /*try {
        	Cache<Object, Object> c = new DefaultCacheManager("infinispan.xml").getCache("sample-cache");
        
        } catch (Exception ex) {
        	System.out.println(ex.toString());
        }*/
    }
    
    
    @PostConstruct
    void seeTheProctors() {
    	System.out.println("up and running");
    }


} 
