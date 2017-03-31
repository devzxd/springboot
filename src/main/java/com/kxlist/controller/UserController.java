package com.kxlist.controller;

import com.alibaba.fastjson.JSON;
import com.kxlist.bean.User;
import com.kxlist.repository.UserRepository;
import com.kxlist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zxd
 * @create 2017-03-31 14:52
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 保存
     * @param user
     * @return
     */
    @PostMapping
    public String saveUser(User user){
        userService.save(user);
        return user.toString();
    }

    /**
     * 按id查找
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public String findUser(@PathVariable("id") final String id){
        System.out.println(id);
        User user = userService.findOne(id);
        return user.toString();
    }

    /**
     * 查找所有
     * @return
     */
    @GetMapping()
    public String findUserAll(){
        List<User> userList = userService.findAll();
        return JSON.toJSONString(userList);
    }

    /**
     * 更新年龄
     * @param id
     * @param age
     * @return
     */
    @PutMapping("/{id}")
    public String updateAge(@PathVariable("id") String id,@RequestParam("age") int age){
       return userService.modifyAgeById(age,id)+"";
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") String id){
        userService.delete(id);
        return "删除成功！";
    }
}
