package com.baomidou.ant.sys.service.impl;

import com.baomidou.ant.sys.entity.User;
import com.baomidou.ant.sys.dao.UserMapper;
import com.baomidou.ant.sys.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 冰
 * @since 2021-11-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> selectAll(User user) {
         /*userMapper.selectList(new EntityWrapper<User>()
                .eq("字段名","前端传入的值user.getXXXX")
        )   这是条件查询*/

        return userMapper.selectList(null);     //应该可以这样写，这样写查询所有
    }
}
