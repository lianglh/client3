package com.dandan.client3.servisce.impl;

//import com.codingapi.txlcn.tc.annotation.LcnTransaction;

import com.dandan.client3.entity.Admin;
import com.dandan.client3.mapper.AdminMapper;
import com.dandan.client3.servisce.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//import org.springframework.transaction.annotation.Transactional;


@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    AdminMapper adminMapper;

    @Override
 //   @LcnTransaction
    public Admin inserAdmin(Admin admin) throws Exception {
        String roles=admin.getRoles();

        adminMapper.insertAdmin(admin);

        return admin;
    }


}
