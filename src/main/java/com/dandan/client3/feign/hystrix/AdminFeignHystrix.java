package com.dandan.client3.feign.hystrix;


import com.dandan.client3.common.ResultObject;
import com.dandan.client3.entity.Admin;
import com.dandan.client3.feign.AdminFeign;

public class AdminFeignHystrix implements AdminFeign {


    @Override
    public ResultObject addAdmin(Admin admin) {
        return null;
    }

}
