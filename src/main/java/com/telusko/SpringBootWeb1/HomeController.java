package com.telusko.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String  home(){
        System.out.println("Home method called");
        return "index.jsp";
    }

    @RequestMapping("add")
    public String add(@RequestParam("num1") int num_1, @RequestParam("num2") int num_2, HttpSession session){
        int result = num_1 + num_2;
       //Set result to session; gets hold of data between multiple web pages
        session.setAttribute("result", result);

        return "result.jsp";
    }

}
