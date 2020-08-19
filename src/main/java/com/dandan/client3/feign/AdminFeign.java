package com.dandan.client3.feign;


import com.dandan.client3.common.ResultObject;
import com.dandan.client3.entity.Admin;
import com.dandan.client3.feign.hystrix.AdminFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "client1",fallback = AdminFeignHystrix.class)
public interface AdminFeign {
    String API="${service.prefix}/adminApi";
    @PostMapping( value =API+ "/addAdmin" )
    public ResultObject addAdmin(Admin admin);

    @GetMapping("c/hello")
    String getHello(@RequestParam(value = "name") String name);
}
