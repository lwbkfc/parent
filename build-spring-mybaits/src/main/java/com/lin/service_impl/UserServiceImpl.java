package com.lin.service_impl;

import com.lin.dao.UserMapper;
import com.lin.po.User;
import com.lin.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/pattern1/8.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User getUserById(Long id) {
        return userMapper.getUserById(id);
    }
}
