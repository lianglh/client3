package com.dandan.client3.controller;

import com.dandan.client3.common.ResultObject;
import com.dandan.client3.entity.Admin;
import com.dandan.client3.servisce.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
@RequestMapping("adminApi")
@Api(tags = "AdminController",description="用户管理接口")
public class AdminController {

    @Resource
    AdminService adminService;

    /* 新增用户信息*/
    @ApiOperation("添加用户")
    @GetMapping( value = "/addAdmin" )
    public ResultObject addAdmin() throws Exception {
        ResultObject<Admin> resultObject=new ResultObject();
        Admin admin=adminService.inserAdmin();

        return null;
    }

}
