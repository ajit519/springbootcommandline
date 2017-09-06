package com.example.spring;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;

import java.util.Properties;

class EnvironmentListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {

    //@EventListener
    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
        System.out.println("Hello from listener");
        String password = event.getEnvironment().getProperty("password");
        Properties properties = new Properties();
        properties.put("password", password+123);
        event.getEnvironment().getPropertySources().addFirst(new PropertiesPropertySource("props", properties));

    }
}
