package com.example.controller;


import com.example.entity.Result;
import com.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
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

        //基于restTemplate调用查询
//        Result forObject = restTemplate.getForObject("http://localhost:8080/user/{id}", Result.class, 2);
//        return forObject.toString();


        //基于restTemplate调用新增

//        User user = new User("陈锦房","浙江温州");
//        //url:远程地址；object：post请求参数；Class<T>:返回的类型
//        ResponseEntity<Result> resultResponseEntity = restTemplate.postForEntity("http://localhost:8080/user/add", user, Result.class);
//
//        return  resultResponseEntity.getBody().toString();

        //基于restTemplate修改
//        User user = new User(1,"陈锦房","浙江温州龙湾区");
//        HttpEntity<User> userHttpEntity = new HttpEntity<>(user);
//        ResponseEntity<Result> resultResponseEntity = restTemplate.exchange("http://localhost:8080/user/{id}", HttpMethod.PUT,userHttpEntity,Result.class,1);
//        System.out.println(resultResponseEntity.toString());
//        return resultResponseEntity.getBody().toString();


        //基于restTemplate删除

        ResponseEntity<Result> resultResponseEntity = restTemplate.exchange("http://localhost:8080/user/{id}", HttpMethod.DELETE,null,Result.class,1);
        System.out.println(resultResponseEntity.toString());
        return resultResponseEntity.getBody().toString();
     }
}
