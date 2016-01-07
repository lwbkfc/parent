package com.lin.action;

import com.lin.po.User;
import com.lin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

/**
 * Created by lwb on 2016/1/6.
 */
@Controller
@RequestMapping("/mongo")
public class TestAction {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/test")
    @ResponseBody
    public String test(HttpServletRequest request,HttpServletResponse response){

        User user = new User();
        user.setId(1L);
        user.setUsername("林文波");
        user.setPassword("tiantian");

        userService.insert(user);
        return "4444欢迎你，北京";
    }
}
