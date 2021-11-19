package com.baomidou.ant.sys.service;

import com.baomidou.ant.sys.entity.User;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 冰
 * @since 2021-11-19
 */
public interface UserService extends IService<User> {

    //查询所有
    public List<User> selectAll(User user);  //名字自己取
}
