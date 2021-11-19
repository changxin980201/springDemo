package com.baomidou.ant.sys.controller;


import com.baomidou.ant.sys.config.HttpClientConfig;
import com.baomidou.ant.sys.entity.User;
import com.baomidou.ant.sys.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 冰
 * @since 2021-11-19
 */
@Api(tags = "用户表")
@RestController
@RequestMapping("/user")
@ResponseBody
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 查询所有客户信息
     * @param user
     * @return
     */
    @ApiOperation(value = "查询所有用户",notes = "这是用来查询所有用户列表")
    @GetMapping("/all")     //子路径
    public List<User> All(User user){
        return userService.selectAll(user);
    };

    /**
     * 测试
     * @param url
     * @param body
     * @return
     */
    @ApiOperation(value = "test")
    @PostMapping("test")
    public String Test(String url,String body)
    {

        try {
            return HttpClientConfig.PostUrl(url,body);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    };
}

