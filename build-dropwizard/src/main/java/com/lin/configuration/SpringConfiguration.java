package com.lin.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Lists;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.List;

/**
 * Created by Administrator on 2016/2/19.
 */
public class SpringConfiguration extends Configuration {
    public static final String WEB_APPLICATION_CONTEXT = "web";
    public static final String APPLICATION_CONTEXT = "app";
    public static final String CLASSPATH_CONFIG = "classpath";
    public static final String FILE_CONFIG = "file";
    @JsonProperty
    private String appContextType;
    @JsonProperty
    private String configLocationsType;
    @JsonProperty
    private List<String> configLocations;
    @JsonProperty
    private boolean registerConfiguration;
    @JsonProperty
    private boolean registerEnvironment;

    public SpringConfiguration() {
    }

    public static SpringConfiguration getDefault() {
        SpringConfiguration configuration = new SpringConfiguration();
        configuration.setAppContextType("web");
        configuration.setConfigLocationsType("classpath");
        configuration.setConfigLocations(Lists.newArrayList(new String[]{"*.xml"}));
        configuration.setRegisterConfiguration(true);
        configuration.setRegisterEnvironment(true);
        return configuration;
    }

    public String getAppContextType() {
        return this.appContextType;
    }

    public void setAppContextType(String appContextType) {
        this.appContextType = appContextType;
    }

    public String getConfigLocationsType() {
        return this.configLocationsType;
    }

    public void setConfigLocationsType(String configLocationsType) {
        this.configLocationsType = configLocationsType;
    }

    public List<String> getConfigLocations() {
        return this.configLocations;
    }

    public void setConfigLocations(List<String> configLocations) {
        this.configLocations = configLocations;
    }

    public boolean isRegisterConfiguration() {
        return this.registerConfiguration;
    }

    public void setRegisterConfiguration(boolean registerConfiguration) {
        this.registerConfiguration = registerConfiguration;
    }

    public boolean isRegisterEnvironment() {
        return this.registerEnvironment;
    }

    public void setRegisterEnvironment(boolean registerEnvironment) {
        this.registerEnvironment = registerEnvironment;
    }
}
