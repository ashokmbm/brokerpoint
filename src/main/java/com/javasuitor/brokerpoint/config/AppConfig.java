package com.javasuitor.brokerpoint.config;


import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

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
	 
	 @Bean(name = "messageSource")
	 public ReloadableResourceBundleMessageSource messageSource() {
	   ReloadableResourceBundleMessageSource messageBundle = new ReloadableResourceBundleMessageSource();
	   messageBundle.setBasename("classpath:messages/messages");
	   messageBundle.setDefaultEncoding("UTF-8");
	   return messageBundle;
	 }
	 
	 
	 @Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		// TODO Auto-generated method stub
		
		 converters.add(jsonConverter());
		 
	}
	 
	 @Bean
	 public ObjectMapper jacksonObjectMapper() {
	 ObjectMapper objectMapper = new ObjectMapper();
	 objectMapper.setSerializationInclusion(Include.NON_NULL);
	 return objectMapper;
	 }

	 @Bean
	 public MappingJackson2HttpMessageConverter jsonConverter() {
	 MappingJackson2HttpMessageConverter jacksonConverter = new
	 MappingJackson2HttpMessageConverter();
	 jacksonConverter.setSupportedMediaTypes(Arrays.asList(MediaType.valueOf("application/json")));
	 jacksonConverter.setObjectMapper(jacksonObjectMapper());
	 return jacksonConverter;
	 }
	 
	 	
	
}
