package com.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// config class no xml file, add Beans
@Configuration
//@ComponentScan("com.springdemo")
@PropertySource("classpath:sport.properties")
@PropertySource("classpath:mylogger.properties")
public class SportConfig {
	
	
	// logging stuff
	@Bean
	public MyLoggerConfig myLoggerConfig(@Value("${root.logger.level}") String rootLoggerLevel,
										 @Value("${printed.logger.level}") String printedLoggerLevel) {
 
		MyLoggerConfig myLoggerConfig = new MyLoggerConfig(rootLoggerLevel, printedLoggerLevel);
 
		return myLoggerConfig;
	}
	
	// define bean for a our sad fortune service
	// method name of the Bean Id is sadFortuneService which is registered, not using component scan 
	// an instance of SadFortuneService is created
	// @Bean is singleton by default
	@Bean
	public IFortuneService sadFortuneService() {
		
		return new SadFortuneService();
	}
	
	// define bean for our swim coach AND inject dependency
	// "This specifies that the bean will bean id of "swimCoach". The method name determines the bean id. 
	// The return type is the Coach interface"
	// "creating a SwimCoach and injecting the sadFortuneService()"
	// "The @Bean will intercept and return a singleton instance of sadFortuneService. The sadFortuneService
	// is then injected into the swim coach instance"
	@Bean
	public ICoach swimCoach() {
		
		return new SwimCoach(sadFortuneService());
	}
	
	
	
}
