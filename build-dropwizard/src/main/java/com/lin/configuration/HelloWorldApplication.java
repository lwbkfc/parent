package com.lin.configuration;

import com.lin.resource.HelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;

/**
 * Created by Administrator on 2016/2/19.
 */
public class HelloWorldApplication extends Application<CustomConfiguration> {
    public static void main(String[] args) throws Exception {
        new HelloWorldApplication().run(args);
    }
    @Override
    public void run(CustomConfiguration configuration, Environment environment) throws Exception {
//        TemplateHealthCheck healthCheck = new TemplateHealthCheck(configuration.getTemplate());
//        environment.healthChecks().register("template",healthCheck);
        HelloWorldResource resource = new HelloWorldResource();
        environment.jersey().register(resource);
    }
}
