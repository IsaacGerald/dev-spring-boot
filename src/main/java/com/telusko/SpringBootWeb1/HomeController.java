package com.telusko.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String  home(){
        System.out.println("Home method called");
        return "index.jsp";
    }

    @RequestMapping("add")
    public String add(HttpServletRequest req, HttpSession session){
        int num1  = Integer.parseInt(req.getParameter("num1"));
        int num2  = Integer.parseInt(req.getParameter("num2"));

        int result = num1 + num2;
       //Set result to session; gets hold of data between multiple web pages
        session.setAttribute("result", result);

        return "result.jsp";
    }

}
