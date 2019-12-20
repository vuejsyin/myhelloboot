package com.xr.springboot.controller;


import com.xr.springboot.model.User;
import com.xr.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public ModelAndView select(){
        ModelAndView mv=new ModelAndView();
        List<User> users = userService.serviceUser();
        mv.addObject("users",users);
        mv.setViewName("success");
        return mv;
    }
}
