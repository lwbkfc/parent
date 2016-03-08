package com.lin.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

/**
 * Created by Administrator on 2016/2/19.
 */
public class CustomConfiguration extends Configuration{
    @JsonProperty("spring")
    private SpringConfiguration spring;

    public SpringConfiguration getSpring() {
        return spring;
    }

    public void setSpring(SpringConfiguration spring) {
        this.spring = spring;
    }
}
