package com.dandan.client3.servisce.impl;

//import com.codingapi.txlcn.tc.annotation.LcnTransaction;

import com.dandan.client3.entity.Admin;
//import com.dandan.client3.feign.AdminFeign;
//import com.dandan.client3.mapper.AdminMapper;
import com.dandan.client3.servisce.AdminService;
import org.springframework.stereotype.Service;

//import javax.annotation.Resource;

//import org.springframework.transaction.annotation.Transactional;


@Service
public class AdminServiceImpl implements AdminService {
    //@Resource
    //AdminMapper adminMapper;
    //@Resource
   // AdminFeign adminFeign;

    @Override
 //   @LcnTransaction
    public Admin inserAdmin() {
       // String roles=admin.getRoles();
        //adminFeign.addAdmin(admin);
       // adminMapper.insertAdmin();

        return null;
    }


}
