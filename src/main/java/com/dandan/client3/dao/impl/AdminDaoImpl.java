package com.dandan.client3.dao.impl;

//import com.codingapi.txlcn.tc.annotation.LcnTransaction;

import com.dandan.client3.dao.AdminDao;
import com.dandan.client3.entity.Admin;
import com.dandan.client3.feign.AdminFeign;
import com.dandan.client3.mapper.AdminMapper;
import com.dandan.client3.servisce.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class AdminDaoImpl implements AdminDao {
    @Resource
    AdminMapper adminMapper;

    @Override
 //   @LcnTransaction
    public Admin inserAdmin() {
       // Str   ing roles=admin.getRoles();
       // adminFeign.addAdmin(null);
        adminMapper.insertAdmin();

        return null;
    }


}
