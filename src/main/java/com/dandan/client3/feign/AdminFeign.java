package com.dandan.client3.feign;


import com.dandan.client3.common.ResultObject;
import com.dandan.client3.entity.Admin;
import com.dandan.client3.feign.hystrix.AdminFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;


@FeignClient(value = "client3",fallback = AdminFeignHystrix.class)
public interface AdminFeign {
    String API="aaa/adminApi";
    @PostMapping( value =API+ "/addAdmin" )
    public ResultObject addAdmin(Admin admin);
}
