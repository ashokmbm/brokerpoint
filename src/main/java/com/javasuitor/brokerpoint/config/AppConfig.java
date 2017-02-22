package com.javasuitor.brokerpoint.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.javasuitor.brokerpoint")
@Import(DBConfig.class)
public class AppConfig extends WebMvcConfigurerAdapter {

	 @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    	registry.addResourceHandler("/app-resources/**").addResourceLocations("/resources/");
	    }    
	
	 @Bean  
	    public InternalResourceViewResolver viewResolver() {  
		    InternalResourceViewResolver resolver = new InternalResourceViewResolver();  
	            resolver.setPrefix("/WEB-INF/view/");  
	            resolver.setSuffix(".jsp");
	            return resolver;  
	    }
	 
	 	
	
}
