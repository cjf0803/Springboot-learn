package com.example.service;

import com.example.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class UserService {
    private static Map<Integer, User> users=new HashMap<>();
    static {
        users.put(1,new User(1,"张三","北京"));
        users.put(2,new User(2,"李四","上海"));
        users.put(3,new User(3,"王五","深圳"));
        users.put(4,new User(4,"刘六","广州"));
    }

    //根据id查询用户
    public User getUserById(Integer id){
        return  users.get(id);
    }
    //查询所有用户
    public List<User> getAllUser(){
        return new ArrayList(users.values());
    }
    //新增用户
    public void  add(User user){
            Integer newId=users.size()+1;
            user.setId(newId);
            users.put(newId,user);
    }
    //删除用户
    public void delete(Integer id){
        users.keySet().removeIf(key->key==id);
    }
    //更新修改
    public void update(User user){
        users.replace(user.getId(),user);
    }
}
