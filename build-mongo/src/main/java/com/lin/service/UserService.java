package com.lin.service;

import com.lin.dao.UserDao;
import com.lin.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/1/7.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public void insert(User user){
        userDao.insert(user);
    }
}
