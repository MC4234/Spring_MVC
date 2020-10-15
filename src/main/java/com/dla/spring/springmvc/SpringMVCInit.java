package com.dla.spring.springmvc;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

//java equivalent for a web.xml
public class SpringMVCInit implements WebApplicationInitializer 
{
    public void onStartup(ServletContext servletContext) throws ServletException
    {
        //spring mvc webapplication
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringWebConfig.class);
        
        //to make out spring context talk to web container
        ctx.setServletContext(servletContext); //
        //ctx becomes web aware spring application context
        
        //configure Dispatcher Servlet
        ServletRegistration.Dynamic servletDynamic = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
        
        //now my app is a spring mvc web application
        
        servletDynamic.addMapping("/mvc/*"); //which urls /requests you should listen to
        
        servletDynamic.setLoadOnStartup(1);//true
        //as soon as the server starts, my app is also up and ready to listen to requests, and if there is an error,
        //the error is not thrown until the forst request comes in
    }

}
