package com.example.controller;

import com.example.entity.Result;
import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
   @GetMapping("/{id}")
    public Result getUser(@PathVariable Integer id){
       User user=userService.getUserById(id);
        return new Result<>(200,"查询成功",user);

   }

   //新增
   @PostMapping("/add")
   public Result addUser(@RequestBody User user){
       userService.add(user);

       return new Result<>(200,"添加成功",userService.getAllUser());

   }
   //修改
   @PutMapping("/{id}")
   public Result updateUser(@RequestBody User user){
       userService.update(user);
       return new Result<>(200,"修改成功",userService.getAllUser());

   }
    //删除
    @DeleteMapping ("/{id}")
    public Result deleteUser(@PathVariable Integer id){
        userService.delete(id);
        return new Result<>(200,"删除成功",userService.getAllUser());

    }




}
