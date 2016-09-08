package com.sample.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.sample.domain.Greeting;

@Service
@Path("/hello-world")
@Produces({"application/json", "application/xml"})
@Consumes({"application/json", "application/xml"})

public class HelloWorldService {
	
    private CounterService counterService;



    @Autowired
    public HelloWorldService(CounterService counterService) {
        this.counterService = counterService;
    }
    

	@GET
	@Cacheable(value="helloCache")
    public Response sayHelloPath(@PathParam("name") String name) {
    
    	System.out.println("sayHello " + name);
    	if (name == null || name.equals("")) {
    		name = "Stranger";
    	}
    	Greeting g =  new Greeting(name);
    	return Response.status(200).entity(g).build();

    }

}