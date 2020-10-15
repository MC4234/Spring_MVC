package com.dla.spring.springmvc;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@ComponentScan("com.dla.spring")
@Configuration
public class SpringWebConfig
{
     @Bean
     public ViewResolver viewResolver()
     {
         InternalResourceViewResolver vs = new InternalResourceViewResolver();
         vs.setViewClass(JstlView.class);//jsp kind of view.
         vs.setPrefix("/WEB-INF/views/");
         vs.setSuffix(".jsp");
         return vs;
     }
}