package com.tpe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller//requests can be received
@RequestMapping("/students")
//class level valid for all controller method,
//method level valid for only method below it

public class StudentController {
    @GetMapping("/hi")
    public ModelAndView sayHi(){
        ModelAndView maw=new ModelAndView();
        maw.addObject("message","Hi");
        maw.addObject("messageBody","dynamic");
        maw.setViewName("hi");
        return maw;

    }
    //1 - List all Students
//http://localhost:8080/SpringMvc/students + GET Method
   // @GetMapping
  //  public ModelAndView getStudents(){
    //    ModelAndView mav = new ModelAndView();
     //   mav.addObject("studentList", );
     //   mav.setViewName("students");
     //   return mav;
    }

