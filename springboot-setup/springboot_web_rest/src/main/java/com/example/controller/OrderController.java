package com.example.controller;


import com.example.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    //声明了RestTemplate

    private  final RestTemplate restTemplate;
    //当bean没有无参构造函数的时候，spring 将自动拿到有参的构造函数，参数将自动注入

     public  OrderController(RestTemplateBuilder restTemplateBuilder){
         this.restTemplate=restTemplateBuilder.build();
     }
    @RequestMapping("/order")
    public String Order(){
        //下单  需要远程访问rest 服务
        Result forObject = restTemplate.getForObject("http://localhost:8080/user/{id}", Result.class, 2);
        return forObject.toString();
    }
}
