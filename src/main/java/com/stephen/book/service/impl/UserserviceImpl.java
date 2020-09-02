package com.stephen.book.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.stephen.book.entity.User;
import com.stephen.book.mapper.UserMapper;
import com.stephen.book.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ssc on 2020-09-02 17:05 .
 * Description:
 */
@Service
public class UserserviceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String login(String username, String password) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username",username)
                .eq("password",password);
        User user = userMapper.selectOne(queryWrapper);
        if (user == null) {
            // return CommonResult.failed(ResultCode.USERNAME_PASSWORD_ERROR);
            return "登录失败";
        }
        return "登录成功";
        // return CommonResult.success("登录成功");
    }
}
