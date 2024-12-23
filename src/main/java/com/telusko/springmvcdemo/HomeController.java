package com.telusko.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

    @ModelAttribute("course")
    public String courseName(){
        return  "Java";
    }

    @RequestMapping("/")
    public String  home(){
        System.out.println("Home method called");
        return "index";
    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int num_1, @RequestParam("num2") int num_2, ModelAndView mv){
        int result = num_1 + num_2;
       //Set result to session; gets hold of data between multiple web pages
        //session.setAttribute("result", result);
        mv.addObject("result", result);
        mv.setViewName("result");

        return mv;
    }

    @RequestMapping("addAlien")
    public String addAlien(Alien alien){ //One can use @ModelAttribute("...") incase you need to use a different object name

        return "result";
    }

}
