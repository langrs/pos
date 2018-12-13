package com.yx.pos.controller;

import com.yx.pos.dao.SysUserDao;
import com.yx.pos.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(UserController.class);


    @Resource
    SysUserService sysUserService;


    @RequestMapping(value = "/getAll")
    public String getAll(){
        sysUserService.getAll();
        return "ok";
    }
}
