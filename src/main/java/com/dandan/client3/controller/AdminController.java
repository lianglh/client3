package com.dandan.client3.controller;

import com.dandan.client3.common.ResultObject;
import com.dandan.client3.entity.Admin;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
@RequestMapping("${service.prefix}/adminApi")
@Api(tags = "AdminController",description="用户管理接口")
public class AdminController {


    /* 新增用户信息*/
    @ApiOperation("添加用户")
    @PostMapping( value = "/addAdmin" )
    public ResultObject addAdmin(@RequestBody @Valid Admin admin, BindingResult result, HttpServletRequest request) {
        ResultObject<Admin> resultObject=new ResultObject();
        return null;
    }

}
