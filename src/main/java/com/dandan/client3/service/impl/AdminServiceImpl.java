package com.dandan.client3.service.impl;

import com.dandan.client3.common.ResultObject;
import com.dandan.client3.entity.Admin;
import com.dandan.client3.feign.AdminFeign;
import com.dandan.client3.mapper.AdminMapper;
import com.dandan.client3.service.AdminService;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    AdminMapper adminMapper;
    @Resource
    AdminFeign adminFeign;

    @Override
 //   @LcnTransaction
    public String inserAdmin(String name) {
       // Str   ing roles=admin.getRoles();
        String f= adminFeign.addAdmin(name);
    //   long d= adminMapper.insertAdmin(name);
        return f;
    }
    public String getJobNumber(){
      String dd=  adminMapper.getJobNumber();
        return dd;
    }



}
