package com.xr.springboot.controller;

import com.xr.springboot.model.Baog;
import com.xr.springboot.model.User;
import com.xr.springboot.service.BaoService;
import com.xr.springboot.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
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

    @Autowired
    private BaoService baoService;

    //@ApiOperation(value="删除用户", notes="根据url的id来指定删除对象")
   // @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public ModelAndView select(){
        System.out.println("abc");
        System.out.println("abct");
        List<User> users = userService.findUsers();
        ModelAndView mv = new ModelAndView();
        mv.addObject("users",users);
        mv.setViewName("success");
        return mv;
    }

    @RequestMapping(value = "/selectb", method = RequestMethod.GET)
    public ModelAndView selectb(){
        System.out.println("abc");
        ModelAndView mv = new ModelAndView();
        Baog baog = baoService.selectByPrimaryKey(3);
        System.out.println(baog);
        mv.setViewName("success");
        return mv;
    }


}
