package com.dandan.client3.feign.hystrix;


import com.dandan.client3.common.ResultObject;
import com.dandan.client3.entity.Admin;
import com.dandan.client3.feign.AdminFeign;
import org.springframework.stereotype.Component;

@Component
public class AdminFeignHystrix implements AdminFeign {


    @Override
    public String addAdmin(String name) {
        return name;
    }

    @Override
    public String getHello(String name) {
        return "hello " + name + ", error!";
    }

}
