package com.learn.SpringBootWeb;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
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
        return "JAVA";
    }

    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int num, @RequestParam("num2") int num2, ModelAndView mv){


        int result = num + num2 ;

        mv.addObject("result",result);
        mv.setViewName("result");

        return mv;
    }

//    Here ModelAttribute is optional we can use or not use
    /*
@RequestMapping("addAlien")
public String addAlien(@ModelAttribute Alien alien) {
    return "result";
}
*/

    @RequestMapping("addAlien")
    public String addAlien(Alien alien) {
        return "result";
    }
}
