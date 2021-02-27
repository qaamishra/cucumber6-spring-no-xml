package com.qa.steps;

import com.qa.config.SpringConf;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;

//Note this class should be in the steps folder else it will not detect
/*
Error would be
SEVERE: Exception while executing pickle
java.util.concurrent.ExecutionException: io.cucumber.core.backend.CucumberBackendException: Please annotate a glue class with some context configuration.

For example:

   @CucumberContextConfiguration
   @SpringBootTest(classes = TestConfig.class)
   public class CucumberSpringConfiguration { }
Or:

   @CucumberContextConfiguration
   @ContextConfiguration( ... )
   public class CucumberSpringConfiguration { }
	at java.util.concurrent.FutureTask.report(FutureTask.java:122)
	at java.util.concurrent.FutureTask.get(FutureTask.java:192)
	at io.cucumber.core.runtime.Runtime.run(Runtime.java:93)
	at io.cucumber.core.cli.Main.run(Main.java:92)
	at cucumber.api.cli.Main.run(Main.java:30)
	at cucumber.api.cli.Main.main(Main.java:15)
Caused by: io.cucumber.core.backend.CucumberBackendException: Please annotate a glue class with some context configuration.
 */
@CucumberContextConfiguration
@ComponentScan(basePackages = "com.qa")
@ContextConfiguration(classes = SpringConf.class)
public class CucumberSpringConfiguration {
}
