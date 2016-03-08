package com.lin.resource;

import com.lin.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by Administrator on 2016/2/19.
 */
@Path("hello-world")
@Produces("application/json")
public class HelloWorldResource {
    @Autowired
    private HelloService helloService;

    @GET
    @Path("hello")
    public String sayHello(){
        return helloService.hello333();
    }
}
