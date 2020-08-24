package com.hwt.controller;

import com.hwt.entity.User;
import com.hwt.service.UserService;
import com.hwt.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author 黄雯婷
 * @version 1.0
 * @description: TODO
 * @date 2020-08-24 14:18:36
 **/
@RestController
@RequestMapping("user")
@Api(tags="用户管理相关接口")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation("添加用户接口")
    @PostMapping("/addUser")
    public ResultVO addUser(@RequestBody @Valid User user){
        //如果有参数校验失败，会将错误信息封装成object组装在BindingResult中
        userService.addUser(user);
        return new ResultVO(null);
    }
    @ApiOperation("获取用户接口")
    @GetMapping("/getUser")
    public ResultVO getUser(){
        User user=new User();
        user.setAccount("1234567");
        user.setEmail("123456@qq.com");
        user.setId(1L);
        user.setPassword("7777777");
        return new ResultVO(user);
    }
}
