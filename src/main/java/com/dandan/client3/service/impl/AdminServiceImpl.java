package com.dandan.client3.service.impl;

import com.dandan.client3.entity.Admin;
import com.dandan.client3.feign.AdminFeign;
import com.dandan.client3.mapper.AdminMapper;
import com.dandan.client3.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    AdminMapper adminMapper;
    @Resource
    AdminFeign adminFeign;

 /*   @Override
 //   @LcnTransaction
    public Admin inserAdmin(String name) {
       // Str   ing roles=admin.getRoles();
       // adminFeign.addAdmin(name);
        adminMapper.insertAdmin(name);
        return null;
    }*/
    public String getJobNumber(){
        adminMapper.getJobNumber();
        return null;
    }



}
