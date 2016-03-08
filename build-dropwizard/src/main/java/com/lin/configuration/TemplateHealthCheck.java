package com.lin.configuration;

import com.codahale.metrics.health.HealthCheck;

/**
 * Created by Administrator on 2016/2/19.
 */
public class TemplateHealthCheck extends HealthCheck {
    private String template;

    public TemplateHealthCheck(String template) {
        this.template = template;
    }

    @Override
    protected Result check() throws Exception {
        String saying = String.format(template,"TEST");
        if (!saying.contains("TEST")){
            return Result.unhealthy("template doesn't include a name");
        }
        return Result.healthy();
    }
}






























