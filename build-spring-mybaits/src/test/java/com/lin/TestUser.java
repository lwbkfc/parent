package com.lin;

import com.lin.po.User;
import com.lin.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/1/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:springContext.xml"})
public class TestUser {
    private static Logger logger = LoggerFactory.getLogger(TestUser.class);

    @Resource
    private IUserService userService;

    @Test
    public void testGet(){
        User user = userService.getUserById(1L);
        logger.info(user.getPassword());
    }
}
