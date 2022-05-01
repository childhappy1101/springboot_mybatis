package com.rays.controller;

import com.rays.bean.UserBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "用户管理接口")
@RequestMapping("/user")
public class SwaggerController {
    @PostMapping("/addUser")
    @ApiOperation("添加用户的接口")

    public UserBean addUser(@RequestParam(required = true) String userName, String Mail){
        return new UserBean();
    }
}
