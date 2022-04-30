package com.rays.controller;

import com.rays.bean.UserBean;
import com.rays.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloWorldController {
    @Autowired
    IUserService userService;
    @RequestMapping("/hello")
    public String hello(){
        return "DEAR 鲍豫 LOVE YOU SO MUCH";
    }

    @RequestMapping("/index")
    public ModelAndView sayHello(){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

    @RequestMapping(value="/userInfo", method = RequestMethod.GET)
    public ModelAndView getUserInfo(int id){
        UserBean user = userService.getUser(id);
        String page;
        if (user!=null){
            page = "success";
        }else page = "fail";
        ModelAndView mv = new ModelAndView(page);
        return mv;
    }

}
