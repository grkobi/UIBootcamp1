package com.everc.automation.config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

@Config.Sources("classpath:config.properties")
public interface TestConfig extends Config {
    TestConfig CONFIG = ConfigFactory.create(TestConfig.class, System.getenv(), System.getProperties());

 //   @DefaultValue("chrome")
    String browser();
    String siteName();
}