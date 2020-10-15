package com.dla.spring.springmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.dla.spring.model.Student;
import com.dla.spring.service.HomeService;

@Controller
public class HomeController 
{
    @Autowired
    HomeService hs;
    
    @GetMapping("home")//mvc/home
    public String showHome(ModelMap model)
    //model is the object whcih holds the data whcih gets updates and flows between the files/views.
    {
        //get the student list
        List<Student> list = hs.getAllStudents();
        //add list as the request attribute
        
        model.put("studentList", list);//map 
        
        return "home"; //WEB-INF/views/home.jsp
    }
}