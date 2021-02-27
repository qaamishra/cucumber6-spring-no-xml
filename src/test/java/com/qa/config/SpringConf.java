package com.qa.config;

import com.qa.main.MyComponentClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com")
@PropertySource(value = {"test.properties"})
public class SpringConf {

    @Autowired
    private MyComponentClass myComponentClass;


}
