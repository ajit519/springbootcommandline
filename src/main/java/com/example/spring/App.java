package com.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
class App
{

    public static void main( String[] args )
    {

      ConfigurableApplicationContext ctx =  new SpringApplicationBuilder(App.class).listeners(new EnvironmentListener()).run(args);
        System.out.println(ctx.getEnvironment().getProperty("password"));
    }
}
